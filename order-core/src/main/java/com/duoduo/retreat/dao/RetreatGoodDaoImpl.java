package com.duoduo.retreat.dao;

import java.sql.Timestamp;
import java.util.List;

import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.duoduo.retreat.cmd.ListRetreatGoodByCdCmd;
import com.duoduo.schema.Tables;
import com.duoduo.schema.tables.records.RetreatGoodRecord;

@Component
public class RetreatGoodDaoImpl implements RetreatGoodDao {

    @Autowired
    private DSLContext dsl;

    @Override
    public void create(RetreatGoodRecord record) {
        dsl.executeInsert(record);
    }

    @Override
    public void update(RetreatGoodRecord record) {
        dsl.executeUpdate(record);
    }

    @Override
    public void delete(RetreatGoodRecord record) {
        dsl.executeDelete(record);
    }

    @Override
    public List<RetreatGoodRecord> listByCd(ListRetreatGoodByCdCmd cmd) {
        SelectQuery<RetreatGoodRecord>  query = dsl.selectQuery(Tables.RETREAT_GOOD);
        addCondition(query, cmd);
        return query.fetch();
    }

    @Override
    public RetreatGoodRecord findByCd(ListRetreatGoodByCdCmd cmd) {
        SelectQuery<RetreatGoodRecord>  query = dsl.selectQuery(Tables.RETREAT_GOOD);
        addCondition(query, cmd);
        return query.fetchOne();
    }

    @Override
    public RetreatGoodRecord findById(Long id) {
        SelectQuery<RetreatGoodRecord>  query = dsl.selectQuery(Tables.RETREAT_GOOD);
        query.addConditions(Tables.RETREAT_GOOD.ID.eq(id));
        return query.fetchOne();
    }

    @Override
    public Integer findCountByCd(ListRetreatGoodByCdCmd cmd) {
        SelectQuery<RetreatGoodRecord>  query = dsl.selectQuery(Tables.RETREAT_GOOD);
        addCondition(query, cmd);
        return dsl.fetchCount(query);
    }

    private void addCondition(SelectQuery<RetreatGoodRecord> query, ListRetreatGoodByCdCmd cmd) {
        Condition condition = null;
        if(cmd.getId() != null) {
            if(condition == null) {
                condition = Tables.RETREAT_GOOD.ID.eq(cmd.getId());
            } else {
                condition = condition.and(Tables.RETREAT_GOOD.ID.eq(cmd.getId()));
            }
        }
        if(cmd.getStatus() != null) {
            if(condition == null) {
                condition = Tables.RETREAT_GOOD.STATUS.eq(cmd.getStatus());
            } else {
                condition = condition.and(Tables.RETREAT_GOOD.STATUS.eq(cmd.getStatus()));
            }
        }
        if(cmd.getOrderId() != null) {
            if(condition == null) {
                condition = Tables.RETREAT_GOOD.ORDER_ID.eq(cmd.getOrderId());
            } else {
                condition = condition.and(Tables.RETREAT_GOOD.ORDER_ID.eq(cmd.getOrderId()));
            }
        }
        if(cmd.getExpressOrderNo() != null) {
            if(condition == null) {
                condition = Tables.RETREAT_GOOD.EXPRESS_ORDER_NO.eq(cmd.getExpressOrderNo());
            } else {
                condition = condition.and(Tables.RETREAT_GOOD.EXPRESS_ORDER_NO.eq(cmd.getExpressOrderNo()));
            }
        }
        if(cmd.getExpressCompanyName() != null) {
            if(condition == null) {
                condition = Tables.RETREAT_GOOD.EXPRESS_COMPANY_NAME.eq(cmd.getExpressCompanyName());
            } else {
                condition = condition.and(Tables.RETREAT_GOOD.EXPRESS_COMPANY_NAME.eq(cmd.getExpressCompanyName()));
            }
        }
        if(cmd.getRetreatReason() != null) {
            if(condition == null) {
                condition = Tables.RETREAT_GOOD.RETREAT_REASON.eq(cmd.getRetreatReason());
            } else {
                condition = condition.and(Tables.RETREAT_GOOD.RETREAT_REASON.eq(cmd.getRetreatReason()));
            }
        }
        if(cmd.getExpressAmount() != null) {
            if(condition == null) {
                condition = Tables.RETREAT_GOOD.EXPRESS_AMOUNT.eq(cmd.getExpressAmount());
            } else {
                condition = condition.and(Tables.RETREAT_GOOD.EXPRESS_AMOUNT.eq(cmd.getExpressAmount()));
            }
        }
        if(cmd.getRetreatAmount() != null) {
            if(condition == null) {
                condition = Tables.RETREAT_GOOD.RETREAT_AMOUNT.eq(cmd.getRetreatAmount());
            } else {
                condition = condition.and(Tables.RETREAT_GOOD.RETREAT_AMOUNT.eq(cmd.getRetreatAmount()));
            }
        }
        if(cmd.getRemark() != null) {
            if(condition == null) {
                condition = Tables.RETREAT_GOOD.REMARK.eq(cmd.getRemark());
            } else {
                condition = condition.and(Tables.RETREAT_GOOD.REMARK.eq(cmd.getRemark()));
            }
        }
        if(cmd.getCreateTime() != null) {
            if(condition == null) {
                condition = Tables.RETREAT_GOOD.CREATE_TIME.eq(new Timestamp(cmd.getCreateTime().getTime()));
            } else {
                condition = condition.and(Tables.RETREAT_GOOD.CREATE_TIME.eq(new Timestamp(cmd.getCreateTime().getTime())));
            }
        }
        if(cmd.getUpdateTime() != null) {
            if(condition == null) {
                condition = Tables.RETREAT_GOOD.UPDATE_TIME.eq(new Timestamp(cmd.getUpdateTime().getTime()));
            } else {
                condition = condition.and(Tables.RETREAT_GOOD.UPDATE_TIME.eq(new Timestamp(cmd.getUpdateTime().getTime())));
            }
        }
        query.addConditions(condition);
    }

}
