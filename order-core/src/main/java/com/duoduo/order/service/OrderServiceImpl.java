package com.duoduo.order.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoduo.base.resp.PageResp;
import com.duoduo.order.cmd.ListOrderCmd;
import com.duoduo.order.dao.OrderDao;
import com.duoduo.order.po.Order;
import com.duoduo.order.resp.toutiao.ListThirdOrderResp;
import com.duoduo.order.resp.toutiao.SubThirdOrder;
import com.duoduo.order.resp.toutiao.ThirdOrderResp;
import com.duoduo.schema.tables.records.OrderRecord;
import com.duoduo.schema.tables.records.ShopRecord;
import com.duoduo.shop.dao.ShopDao;
import com.duoduo.util.Assert;
import com.duoduo.util.ConvertUtil;
import com.duoduo.util.GsonUtil;
import com.duoduo.util.HttpUtil;
import com.duoduo.util.PageUtil;

@Service
public class OrderServiceImpl implements OrderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);
    
    //finalStatus,page,pageSize,token,timestamp
    private static final String listOrderUrl = "https://shop.snssdk.com/order/order/searchlist?order_id=&post_tel=&post_receiver=&shop_name=&product_name=&start_time=&end_time=&final_status=%s&order=&is_desc=&sort_changed=1&source_type=&logistics_id=&logistics_code=&urge_tag=0&page=%s&pageSize=%s&__token=%s&_=%s";
    
    
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private ShopDao shopDao;
    
    
	@Override
	public PageResp listOrder(ListOrderCmd cmd) {
		Assert.notNull(cmd.getAccount(), "account is null");
		Assert.notNull(cmd.getFinalStatus(), "finalStatus is null");
		if(cmd.getTimestamp() == null) {
			cmd.setTimestamp(System.currentTimeMillis()+"");
		}
		
		ShopRecord shop = shopDao.findByAccount(cmd.getAccount());
		Assert.notNull(shop, "shop not found.account="+cmd.getAccount());
		
		cmd.setPageNo(PageUtil.getPageNo(cmd.getPageNo()));
		cmd.setPageSize(PageUtil.getPageSize(cmd.getPageSize()));
		cmd.setOffset(PageUtil.getOffset(cmd.getPageNo(), cmd.getPageSize()));
		
		ListThirdOrderResp fxgOrderObj = lisFangXinGouOrder(cmd, shop);

		if(fxgOrderObj != null) {
			Integer total = Integer.valueOf(fxgOrderObj.getTotal());
			PageResp page = new PageResp(cmd.getPageNo(), cmd.getPageSize(), total);
			List<Order> orders = new ArrayList<Order>();
			
			if(fxgOrderObj.getData() != null && !fxgOrderObj.getData().isEmpty()) {
				orders = processFangXinGouOrder(fxgOrderObj.getData(), shop);
			}
			
			page.setRows(orders);
			return page;
		}
		return null;
	}
	
	private List<Order> processFangXinGouOrder(List<ThirdOrderResp> fxgOrders, ShopRecord shop) {
		List<Order> list = new ArrayList<Order>();
		
		if(fxgOrders != null && !fxgOrders.isEmpty()) {
			for(ThirdOrderResp fxgOrder : fxgOrders) {
				list.add(saveFangXinGouOrder(fxgOrder, shop));
			}
		}
		return list;
	}

	private Order saveFangXinGouOrder(ThirdOrderResp fxgOrder, ShopRecord shop) {
		OrderRecord order = orderDao.findByOrderId(fxgOrder.getOrder().getOrder_id());
		if(order != null) {
			return ConvertUtil.convert(order, Order.class);
		} else {
			order = convert(fxgOrder);
			order.setInnerCreateTime(new Timestamp((new Date()).getTime()));
			order.setInnerStatus((byte)1);
			order.setAccount(shop.getAccount());
			orderDao.create(order);
			return ConvertUtil.convert(order, Order.class);
		}
	}

	private OrderRecord convert(ThirdOrderResp fxgOrder) {
		OrderRecord order = new OrderRecord();
		
		SubThirdOrder q = fxgOrder.getOrder();
		order.setOrderId(q.getOrder_id());
		order.setUserId(q.getUser_id());
		order.setUserType(q.getUser_type());
		order.setUserName(q.getUser_name());
		order.setSpecDesc(GsonUtil.toJson(q.getSpec_desc()));
		order.setProductId(q.getProduct_id());
		order.setComboId(q.getCombo_id());
		order.setShopId(q.getShop_id());
		order.setShopName(q.getShop_name());
		order.setPayType(q.getPay_type());
		order.setComboAmount(q.getCombo_amount());
		order.setComboNum(q.getCombo_num());
		order.setPostAmount(q.getPost_amount());
		order.setTotalAmount(q.getTotal_amount());
		order.setPostAddr(GsonUtil.toJson(q.getPost_addr()));
		order.setPostCode(q.getPost_code());
		order.setPostReceiver(q.getPost_receiver());
		order.setPostTel(q.getPost_tel());
		order.setLogisticsId(q.getLogistics_id());
		order.setLogisticsCode(q.getLogistics_code());
		order.setLogisticsTime(q.getLogistics_time());
		order.setReceiptTime(q.getReceipt_time());
		order.setBuyerWords(q.getBuyer_words());
		order.setCancelReson(q.getCancel_reason());
		order.setRemark(GsonUtil.toJson(q.getRemark()));
		order.setOrderStatus(q.getOrder_status());
		order.setStatus(q.getStatus());
		order.setCreateTime(q.getCreate_time());
		order.setUpdateTime(q.getUpdate_time());
		order.setFinalStatus(q.getFinal_status());
		order.setSourceId(q.getSource_id());
		order.setSourceType(q.getSource_type());
		order.setSellerWords(q.getSeller_words());
		order.setService(q.getService());
		order.setOpId(q.getOp_id());
		order.setOpTime(q.getOp_time());
		order.setCancelRemark(q.getCancel_remark());
		order.setUrgeCnt(q.getUrge_cnt());
		order.setProductName(q.getProduct_name());
		order.setRepeat(q.getRepeat());
		order.setLogisticsDetail(GsonUtil.toJson(q.getLogistics_detail()));
		order.setAttention(q.getAttention());
		order.setTelArea(q.getTel_area());
		order.setComboName(q.getCombo_name());
		order.setIsFollowArbitration(q.getIs_follow_arbitration());
		order.setAftersale(GsonUtil.toJson(fxgOrder.getAftersale()));
		order.setProduct(GsonUtil.toJson(fxgOrder.getProduct()));
		order.setOrderJsonData(GsonUtil.toJson(fxgOrder.getOrder()));
		return order;
	}

	private ListThirdOrderResp lisFangXinGouOrder(ListOrderCmd cmd, ShopRecord shop) {
		String url = String.format(listOrderUrl, cmd.getFinalStatus(), cmd.getPageNo()-1, cmd.getPageSize(), shop.getToken(), cmd.getTimestamp());
		
		String responseStr = HttpUtil.get(url, getHeaderInfo(shop), null);
		LOGGER.info("lisFangXinGouOrder-responseStr=" + responseStr);
		return GsonUtil.fromJson(responseStr, ListThirdOrderResp.class);
	}
	
	private Map<String, String> getHeaderInfo(ShopRecord shop) {
		String userAgent = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36";

		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Cookie", shop.getCookie());
		headers.put("User-Agent", userAgent);
		return headers;
	}

}
