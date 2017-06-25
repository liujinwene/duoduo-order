package com.duoduo.shop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoduo.base.resp.RestResp;
import com.duoduo.shop.cmd.UpdateShopCmd;
import com.duoduo.shop.service.ShopService;
import com.duoduo.util.GsonUtil;

@RestController
@RequestMapping("/shop")
public class ShopController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShopController.class);
    @Autowired
    private ShopService shopService;
    
    @RequestMapping("/update")
    public String update(UpdateShopCmd cmd) {
    	shopService.update(cmd);
    	RestResp result = new RestResp();
    	return GsonUtil.toJson(result);
    }


}
