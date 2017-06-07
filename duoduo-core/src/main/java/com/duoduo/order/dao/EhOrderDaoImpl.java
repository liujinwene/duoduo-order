package com.duoduo.order.dao;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.duoduo.schema.Tables;
import com.duoduo.schema.tables.records.EhOrderRecord;

@Component
public class EhOrderDaoImpl implements EhOrderDao {
	
	@Autowired
	private DSLContext dsl;

	@Override
	public EhOrderRecord findByOrderId(String orderId) {
		return dsl.selectFrom(Tables.EH_ORDER).where(Tables.EH_ORDER.ORDER_ID.eq(orderId)).fetchOne();
	}

	@Override
	public void create(EhOrderRecord record) {
		dsl.executeInsert(record);
	}

}
