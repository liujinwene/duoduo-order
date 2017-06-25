package com.duoduo.shop.dao;

import java.sql.Timestamp;
import java.util.List;

import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.duoduo.shop.cmd.ListShopByCdCmd;
import com.duoduo.schema.Tables;
import com.duoduo.schema.tables.records.ShopRecord;

@Component
public class ShopDaoImpl implements ShopDao {

    @Autowired
    private DSLContext dsl;

    @Override
    public void create(ShopRecord record) {
        dsl.executeInsert(record);
    }

    @Override
    public void update(ShopRecord record) {
        dsl.executeUpdate(record);
    }

    @Override
    public void delete(ShopRecord record) {
        dsl.executeDelete(record);
    }

    @Override
    public List<ShopRecord> listByCd(ListShopByCdCmd cmd) {
        SelectQuery<ShopRecord>  query = dsl.selectQuery(Tables.SHOP);
        addCondition(query, cmd);
        return query.fetch();
    }

    @Override
    public ShopRecord findByCd(ListShopByCdCmd cmd) {
        SelectQuery<ShopRecord>  query = dsl.selectQuery(Tables.SHOP);
        addCondition(query, cmd);
        return query.fetchOne();
    }

    @Override
    public ShopRecord findById(Long id) {
        SelectQuery<ShopRecord>  query = dsl.selectQuery(Tables.SHOP);
        query.addConditions(Tables.SHOP.ID.eq(id));
        return query.fetchOne();
    }

    @Override
    public Integer findCountByCd(ListShopByCdCmd cmd) {
        SelectQuery<ShopRecord>  query = dsl.selectQuery(Tables.SHOP);
        addCondition(query, cmd);
        return dsl.fetchCount(query);
    }

    private void addCondition(SelectQuery<ShopRecord> query, ListShopByCdCmd cmd) {
        Condition condition = null;
        if(cmd.getId() != null) {
            if(condition == null) {
                condition = Tables.SHOP.ID.eq(cmd.getId());
            } else {
                condition = condition.and(Tables.SHOP.ID.eq(cmd.getId()));
            }
        }
        if(cmd.getShopId() != null) {
            if(condition == null) {
                condition = Tables.SHOP.SHOP_ID.eq(cmd.getShopId());
            } else {
                condition = condition.and(Tables.SHOP.SHOP_ID.eq(cmd.getShopId()));
            }
        }
        if(cmd.getShopName() != null) {
            if(condition == null) {
                condition = Tables.SHOP.SHOP_NAME.eq(cmd.getShopName());
            } else {
                condition = condition.and(Tables.SHOP.SHOP_NAME.eq(cmd.getShopName()));
            }
        }
        if(cmd.getAccount() != null) {
            if(condition == null) {
                condition = Tables.SHOP.ACCOUNT.eq(cmd.getAccount());
            } else {
                condition = condition.and(Tables.SHOP.ACCOUNT.eq(cmd.getAccount()));
            }
        }
        if(cmd.getToken() != null) {
            if(condition == null) {
                condition = Tables.SHOP.TOKEN.eq(cmd.getToken());
            } else {
                condition = condition.and(Tables.SHOP.TOKEN.eq(cmd.getToken()));
            }
        }
        if(cmd.getCookie() != null) {
            if(condition == null) {
                condition = Tables.SHOP.COOKIE.eq(cmd.getCookie());
            } else {
                condition = condition.and(Tables.SHOP.COOKIE.eq(cmd.getCookie()));
            }
        }
        if(cmd.getJsonData() != null) {
            if(condition == null) {
                condition = Tables.SHOP.JSON_DATA.eq(cmd.getJsonData());
            } else {
                condition = condition.and(Tables.SHOP.JSON_DATA.eq(cmd.getJsonData()));
            }
        }
        query.addConditions(condition);
    }

	@Override
	public ShopRecord findByAccount(String account) {
		SelectQuery<ShopRecord>  query = dsl.selectQuery(Tables.SHOP);
        query.addConditions(Tables.SHOP.ACCOUNT.eq(account));
        return query.fetchOne();
	}

}
