package com.duoduo.shop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.duoduo.shop.service.ShopService;

@RestController
public class ShopController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShopController.class);
    @Autowired
    private ShopService ShopService;


}
