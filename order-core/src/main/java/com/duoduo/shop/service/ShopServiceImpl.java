package com.duoduo.shop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoduo.shop.dao.ShopDao;

@Service
public class ShopServiceImpl implements ShopService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShopServiceImpl.class);
    @Autowired
    private ShopDao testShopDao;


}
