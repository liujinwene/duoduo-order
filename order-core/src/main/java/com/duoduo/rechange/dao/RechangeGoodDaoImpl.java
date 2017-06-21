package com.duoduo.rechange.dao;

import java.sql.Timestamp;
import java.util.List;

import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.duoduo.rechange.cmd.ListRechangeGoodByCdCmd;
import com.duoduo.schema.Tables;
import com.duoduo.schema.tables.records.RechangeGoodRecord;

@Component
public class RechangeGoodDaoImpl implements RechangeGoodDao {

    @Autowired
    private DSLContext dsl;

    @Override
    public void create(RechangeGoodRecord record) {
        dsl.executeInsert(record);
    }

    @Override
    public void update(RechangeGoodRecord record) {
        dsl.executeUpdate(record);
    }

    @Override
    public void delete(RechangeGoodRecord record) {
        dsl.executeDelete(record);
    }

    @Override
    public List<RechangeGoodRecord> listByCd(ListRechangeGoodByCdCmd cmd) {
        SelectQuery<RechangeGoodRecord>  query = dsl.selectQuery(Tables.RECHANGE_GOOD);
        addCondition(query, cmd);
        return query.fetch();
    }

    @Override
    public RechangeGoodRecord findByCd(ListRechangeGoodByCdCmd cmd) {
        SelectQuery<RechangeGoodRecord>  query = dsl.selectQuery(Tables.RECHANGE_GOOD);
        addCondition(query, cmd);
        return query.fetchOne();
    }

    @Override
    public RechangeGoodRecord findById(Long id) {
        SelectQuery<RechangeGoodRecord>  query = dsl.selectQuery(Tables.RECHANGE_GOOD);
        query.addConditions(Tables.RECHANGE_GOOD.ID.eq(id));
        return query.fetchOne();
    }

    @Override
    public Integer findCountByCd(ListRechangeGoodByCdCmd cmd) {
        SelectQuery<RechangeGoodRecord>  query = dsl.selectQuery(Tables.RECHANGE_GOOD);
        addCondition(query, cmd);
        return dsl.fetchCount(query);
    }

    private void addCondition(SelectQuery<RechangeGoodRecord> query, ListRechangeGoodByCdCmd cmd) {
        Condition condition = null;
        if(cmd.getId() != null) {
            if(condition == null) {
                condition = Tables.RECHANGE_GOOD.ID.eq(cmd.getId());
            } else {
                condition = condition.and(Tables.RECHANGE_GOOD.ID.eq(cmd.getId()));
            }
        }
        if(cmd.getStatus() != null) {
            if(condition == null) {
                condition = Tables.RECHANGE_GOOD.STATUS.eq(cmd.getStatus());
            } else {
                condition = condition.and(Tables.RECHANGE_GOOD.STATUS.eq(cmd.getStatus()));
            }
        }
        if(cmd.getOrderId() != null) {
            if(condition == null) {
                condition = Tables.RECHANGE_GOOD.ORDER_ID.eq(cmd.getOrderId());
            } else {
                condition = condition.and(Tables.RECHANGE_GOOD.ORDER_ID.eq(cmd.getOrderId()));
            }
        }
        if(cmd.getExpressOrderNo() != null) {
            if(condition == null) {
                condition = Tables.RECHANGE_GOOD.EXPRESS_ORDER_NO.eq(cmd.getExpressOrderNo());
            } else {
                condition = condition.and(Tables.RECHANGE_GOOD.EXPRESS_ORDER_NO.eq(cmd.getExpressOrderNo()));
            }
        }
        if(cmd.getExpressCompanyName() != null) {
            if(condition == null) {
                condition = Tables.RECHANGE_GOOD.EXPRESS_COMPANY_NAME.eq(cmd.getExpressCompanyName());
            } else {
                condition = condition.and(Tables.RECHANGE_GOOD.EXPRESS_COMPANY_NAME.eq(cmd.getExpressCompanyName()));
            }
        }
        if(cmd.getRechangeReason() != null) {
            if(condition == null) {
                condition = Tables.RECHANGE_GOOD.RECHANGE_REASON.eq(cmd.getRechangeReason());
            } else {
                condition = condition.and(Tables.RECHANGE_GOOD.RECHANGE_REASON.eq(cmd.getRechangeReason()));
            }
        }
        if(cmd.getExpressAmount() != null) {
            if(condition == null) {
                condition = Tables.RECHANGE_GOOD.EXPRESS_AMOUNT.eq(cmd.getExpressAmount());
            } else {
                condition = condition.and(Tables.RECHANGE_GOOD.EXPRESS_AMOUNT.eq(cmd.getExpressAmount()));
            }
        }
        if(cmd.getRemark() != null) {
            if(condition == null) {
                condition = Tables.RECHANGE_GOOD.REMARK.eq(cmd.getRemark());
            } else {
                condition = condition.and(Tables.RECHANGE_GOOD.REMARK.eq(cmd.getRemark()));
            }
        }
        if(cmd.getCreateTime() != null) {
            if(condition == null) {
                condition = Tables.RECHANGE_GOOD.CREATE_TIME.eq(new Timestamp(cmd.getCreateTime().getTime()));
            } else {
                condition = condition.and(Tables.RECHANGE_GOOD.CREATE_TIME.eq(new Timestamp(cmd.getCreateTime().getTime())));
            }
        }
        if(cmd.getUpdateTime() != null) {
            if(condition == null) {
                condition = Tables.RECHANGE_GOOD.UPDATE_TIME.eq(new Timestamp(cmd.getUpdateTime().getTime()));
            } else {
                condition = condition.and(Tables.RECHANGE_GOOD.UPDATE_TIME.eq(new Timestamp(cmd.getUpdateTime().getTime())));
            }
        }
        query.addConditions(condition);
    }

}
