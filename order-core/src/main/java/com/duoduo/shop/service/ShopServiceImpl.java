package com.duoduo.shop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoduo.schema.tables.records.ShopRecord;
import com.duoduo.shop.cmd.UpdateShopCmd;
import com.duoduo.shop.dao.ShopDao;
import com.duoduo.util.Assert;
import com.duoduo.util.ConvertUtil;

@Service
public class ShopServiceImpl implements ShopService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShopServiceImpl.class);
    @Autowired
    private ShopDao shopDao;
	@Override
	public void update(UpdateShopCmd cmd) {
		Assert.notNull(cmd.getAccount(), "account is null");
		Assert.notNull(cmd.getShopName(), "shopName is null");
		Assert.notNull(cmd.getToken(), "token is null");
		Assert.notNull(cmd.getCookie(), "cookie is null");
		
		ShopRecord shop = shopDao.findByAccount(cmd.getAccount());
		if(shop == null) {//create
			shop = ConvertUtil.convert(cmd, ShopRecord.class);
			shopDao.create(shop);
		} else {
			shop.setShopName(cmd.getShopName());
			shop.setToken(cmd.getToken());
			shop.setCookie(cmd.getCookie());
			shopDao.update(shop);
		}
	}


}
