package com.duoduo.thirdorder.service.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoduo.configuration.constant.ConfigName;
import com.duoduo.configuration.service.ConfigurationService;
import com.duoduo.message.resp.ReceiveMessageResp;
import com.duoduo.order.dao.OrderDao;
import com.duoduo.schema.tables.records.OrderRecord;
import com.duoduo.thirdorder.resp.BaseThirdOrderResp;
import com.duoduo.thirdorder.resp.ListThirdOrderResp;
import com.duoduo.thirdorder.resp.SubThirdOrder;
import com.duoduo.thirdorder.resp.ThirdOrderResp;
import com.duoduo.thirdorder.service.OrderService;
import com.duoduo.util.GsonUtil;
import com.duoduo.util.HttpUtil;

@Service
public class OrderServiceImpl implements OrderService {
	private static Lock CREATE_ORDER_LOCK = new ReentrantLock();
	private static Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);
	
	private static final String MESSAGE_FORMAT = "【短信回复:%s】";

	String listOrderUrl = "https://shop.snssdk.com/order/order/list";
	String updateOrderUrl = "https://shop.snssdk.com/order/order/edit";
	
	String final_status = "1";
	String order = "create_time";
	String is_desc = "is_desc";
	String page = "0";
	String pageSize = "100";
	
	@Autowired
	private ConfigurationService configurationService;
	@Autowired
	private OrderDao orderDao;

	private String getToken() {
		return configurationService.getValue(ConfigName.TOKEN);
	}
	
	private String getCookie() {
		return configurationService.getValue(ConfigName.COOKIE);
	}
	
	private String getStartTime() {
		return configurationService.getValue(ConfigName.EXPIRED_TIME);
	}
	
	
	@Override
	public ListThirdOrderResp listOrder() {
		String __token = getToken();
		String start_time = getStartTime();

		Map<String, String> params = new HashMap<String, String>();
		params.put("__token", __token);
		params.put("final_status", final_status);
		params.put("order", order);
		params.put("is_desc", is_desc);
		params.put("start_time", start_time);
		params.put("page", page);
		params.put("pageSize", pageSize);

		String responseStr = HttpUtil.get(listOrderUrl, getHeaderInfo(), params);
		LOGGER.info("responseStr=" + responseStr);
		return GsonUtil.fromJson(responseStr, ListThirdOrderResp.class);
	}

	@Override
	public BaseThirdOrderResp updateOrder(SubThirdOrder subOrder, String content) {
		if(StringUtils.isBlank(content)) {
			LOGGER.info("receive content is null.orderId=" + subOrder.getOrder_id());
			return null;
		}
		if(subOrder.getBuyer_words().contains(content)) {
			LOGGER.info("receive content is exist.orderId=" + subOrder.getOrder_id());
			return null;
		}
		
		String __token= getToken();

		Map<String, String> params = convertToOrderUpdateParam(subOrder, __token, content);
		String responseStr = HttpUtil.post(updateOrderUrl, getHeaderInfo(), params);
		return GsonUtil.fromJson(responseStr, BaseThirdOrderResp.class);
	}

	private Map<String, String> convertToOrderUpdateParam(SubThirdOrder subOrder, String __token, String messageStr) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("order_id", subOrder.getOrder_id());
		if(StringUtils.isNotBlank(messageStr)) {
			params.put("buyer_words", subOrder.getBuyer_words() + messageStr);
		}
		params.put("combo_amount", subOrder.getCombo_amount());
		params.put("total_amount", subOrder.getTotal_amount());
		params.put("combo_id", subOrder.getCombo_id());
		params.put("combo_num", subOrder.getCombo_num());
		params.put("logistics_id", subOrder.getLogistics_id());
		params.put("logistics_code", subOrder.getLogistics_code());
		params.put("post_addr[province][id]", subOrder.getPost_addr().getProvince().getId());
		params.put("post_addr[province][name]", subOrder.getPost_addr().getProvince().getName());
		params.put("post_addr[city][id]", subOrder.getPost_addr().getCity().getId());
		params.put("post_addr[city][name]", subOrder.getPost_addr().getCity().getName());
		params.put("post_addr[town][id]", subOrder.getPost_addr().getTown().getId());
		params.put("post_addr[town][name]", subOrder.getPost_addr().getTown().getName());
		params.put("post_addr[detail]", subOrder.getPost_addr().getDetail());
		params.put("post_tel", subOrder.getPost_tel());
		params.put("post_receiver", subOrder.getPost_receiver());
		if(subOrder.getSpec_desc() != null && !subOrder.getSpec_desc().isEmpty()) {
			params.put("spec_desc[0][name]", subOrder.getSpec_desc().get(0).getName());
			params.put("spec_desc[0][value]", subOrder.getSpec_desc().get(0).getValue());
		}
		params.put("__token", __token);
		return params;
	}

	private Map<String, String> getHeaderInfo() {
		String cookie = getCookie();
		String userAgent = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36";

		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Cookie", cookie);
		headers.put("User-Agent", userAgent);
		return headers;
	}

	@Override
	public void updateOrder(ReceiveMessageResp receiveMessage) {
		OrderRecord orderRecord = orderDao.findByTaskId(receiveMessage.getTaskid());
		if(orderRecord != null) {
			//update orderRecord
			orderRecord.setReceiveContent(receiveMessage.getContent());
			orderRecord.setReceiveMessageJson(GsonUtil.toJson(receiveMessage));
			orderRecord.setReceiveTime(new Timestamp(System.currentTimeMillis()));
			orderDao.update(orderRecord);
			//update thirdOrder
			ThirdOrderResp orderResp = GsonUtil.fromJson(orderRecord.getOrderJson(), ThirdOrderResp.class);
			updateOrder(orderResp.getOrder(), String.format(MESSAGE_FORMAT, receiveMessage.getContent()));
		}
	}
	
	@Override
	public ListThirdOrderResp listOrder2() {
		String __token = getToken();
		String final_status = "0";//0-全部
		String start_time = getStartTime();
		String page = getPage();

		Map<String, String> params = new HashMap<String, String>();
		params.put("__token", __token);
		params.put("final_status", final_status);
		params.put("start_time", start_time);
		params.put("page", page);
		params.put("pageSize", "20");

		String responseStr = HttpUtil.get(listOrderUrl, getHeaderInfo(), params);
		LOGGER.info("responseStr=" + responseStr);
		
		ListThirdOrderResp orderResult = GsonUtil.fromJson(responseStr, ListThirdOrderResp.class);
		if(orderResult.isSuccess()) {
			if(orderResult.getData() != null && !orderResult.getData().isEmpty()) {
				List<ThirdOrderResp> orders = orderResult.getData();
				for(ThirdOrderResp order : orders) {
					createOrUpdateOrder(order);
				}
				//更新查询订单：开始时间、页码
				configurationService.update(ConfigName.EXPIRED_TIME, orders.get((orders.size()-1)).getOrder().getCreate_time());
				configurationService.update(ConfigName.PAGE, (Integer.valueOf(page)+1)+"");
			}
		}
		
		return orderResult;
	}

	private void createOrUpdateOrder(ThirdOrderResp order) {
		try {
			CREATE_ORDER_LOCK.lock();
		} catch(Exception e) {
			
		} finally {
			CREATE_ORDER_LOCK.unlock();
		}
	}

	private String getPage() {
		return configurationService.getValue(ConfigName.PAGE);
	}
}
