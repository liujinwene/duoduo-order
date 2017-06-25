package com.duoduo.shop.dao;

import java.util.List;

import com.duoduo.shop.cmd.ListShopByCdCmd;
import com.duoduo.schema.tables.records.ShopRecord;

public interface ShopDao {
    void create(ShopRecord entity);
    void update(ShopRecord entity);
    void delete(ShopRecord entity);
    List<ShopRecord> listByCd(ListShopByCdCmd cmd);
    ShopRecord findByCd(ListShopByCdCmd cmd);
    ShopRecord findById(Long id);
    Integer findCountByCd(ListShopByCdCmd cmd);
	ShopRecord findByAccount(String account);
}
