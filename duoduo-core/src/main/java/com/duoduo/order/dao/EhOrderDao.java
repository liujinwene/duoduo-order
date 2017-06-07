package com.duoduo.order.dao;

import com.duoduo.schema.tables.records.EhOrderRecord;

public interface EhOrderDao {
	EhOrderRecord findByOrderId(String orderId);
	void create(EhOrderRecord record);

}
