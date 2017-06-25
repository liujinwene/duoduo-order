package com.duoduo.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoduo.base.resp.PageResp;
import com.duoduo.base.resp.RestResp;
import com.duoduo.order.cmd.ListOrderCmd;
import com.duoduo.order.service.OrderService;
import com.duoduo.util.GsonUtil;

@RestController
@RequestMapping("/order")
public class OrderController {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);
    @Autowired
    private OrderService orderService;
    
    @RequestMapping("/listOrder")
    public String listOrder(ListOrderCmd cmd) {
    	PageResp data = orderService.listOrder(cmd);
    	return GsonUtil.toJson(new RestResp(data));
    }
}
