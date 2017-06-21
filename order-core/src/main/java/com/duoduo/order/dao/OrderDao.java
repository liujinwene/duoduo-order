package com.duoduo.order.dao;

import java.util.List;

import com.duoduo.order.cmd.ListOrderByCdCmd;
import com.duoduo.schema.tables.records.OrderRecord;

public interface OrderDao {
    void create(OrderRecord entity);
    void update(OrderRecord entity);
    void delete(OrderRecord entity);
    List<OrderRecord> listByCd(ListOrderByCdCmd cmd);
    OrderRecord findByCd(ListOrderByCdCmd cmd);
    OrderRecord findById(Long id);
    Integer findCountByCd(ListOrderByCdCmd cmd);
}
