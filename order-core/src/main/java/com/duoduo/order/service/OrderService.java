package com.duoduo.order.service;

import com.duoduo.base.resp.PageResp;
import com.duoduo.order.cmd.ListOrderCmd;

public interface OrderService {

	PageResp listOrder(ListOrderCmd cmd);

}
