package com.duoduo.order.dao;

import java.sql.Timestamp;
import java.util.List;

import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.duoduo.order.cmd.ListOrderByCdCmd;
import com.duoduo.schema.Tables;
import com.duoduo.schema.tables.records.OrderRecord;

@Component
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private DSLContext dsl;

    @Override
    public void create(OrderRecord record) {
        dsl.executeInsert(record);
    }

    @Override
    public void update(OrderRecord record) {
        dsl.executeUpdate(record);
    }

    @Override
    public void delete(OrderRecord record) {
        dsl.executeDelete(record);
    }

    @Override
    public List<OrderRecord> listByCd(ListOrderByCdCmd cmd) {
        SelectQuery<OrderRecord>  query = dsl.selectQuery(Tables.ORDER);
        addCondition(query, cmd);
        return query.fetch();
    }

    @Override
    public OrderRecord findByCd(ListOrderByCdCmd cmd) {
        SelectQuery<OrderRecord>  query = dsl.selectQuery(Tables.ORDER);
        addCondition(query, cmd);
        return query.fetchOne();
    }

    @Override
    public OrderRecord findById(Long id) {
        SelectQuery<OrderRecord>  query = dsl.selectQuery(Tables.ORDER);
        query.addConditions(Tables.ORDER.ID.eq(id));
        return query.fetchOne();
    }

    @Override
    public Integer findCountByCd(ListOrderByCdCmd cmd) {
        SelectQuery<OrderRecord>  query = dsl.selectQuery(Tables.ORDER);
        addCondition(query, cmd);
        return dsl.fetchCount(query);
    }

    private void addCondition(SelectQuery<OrderRecord> query, ListOrderByCdCmd cmd) {
        Condition condition = null;
        if(cmd.getId() != null) {
            if(condition == null) {
                condition = Tables.ORDER.ID.eq(cmd.getId());
            } else {
                condition = condition.and(Tables.ORDER.ID.eq(cmd.getId()));
            }
        }
        if(cmd.getInnerStatus() != null) {
            if(condition == null) {
                condition = Tables.ORDER.INNER_STATUS.eq(cmd.getInnerStatus());
            } else {
                condition = condition.and(Tables.ORDER.INNER_STATUS.eq(cmd.getInnerStatus()));
            }
        }
        if(cmd.getInnerCreateTime() != null) {
            if(condition == null) {
                condition = Tables.ORDER.INNER_CREATE_TIME.eq(new Timestamp(cmd.getInnerCreateTime().getTime()));
            } else {
                condition = condition.and(Tables.ORDER.INNER_CREATE_TIME.eq(new Timestamp(cmd.getInnerCreateTime().getTime())));
            }
        }
        if(cmd.getInnerUpdateTime() != null) {
            if(condition == null) {
                condition = Tables.ORDER.INNER_UPDATE_TIME.eq(new Timestamp(cmd.getInnerUpdateTime().getTime()));
            } else {
                condition = condition.and(Tables.ORDER.INNER_UPDATE_TIME.eq(new Timestamp(cmd.getInnerUpdateTime().getTime())));
            }
        }
        if(cmd.getOrderId() != null) {
            if(condition == null) {
                condition = Tables.ORDER.ORDER_ID.eq(cmd.getOrderId());
            } else {
                condition = condition.and(Tables.ORDER.ORDER_ID.eq(cmd.getOrderId()));
            }
        }
        if(cmd.getUserId() != null) {
            if(condition == null) {
                condition = Tables.ORDER.USER_ID.eq(cmd.getUserId());
            } else {
                condition = condition.and(Tables.ORDER.USER_ID.eq(cmd.getUserId()));
            }
        }
        if(cmd.getUserType() != null) {
            if(condition == null) {
                condition = Tables.ORDER.USER_TYPE.eq(cmd.getUserType());
            } else {
                condition = condition.and(Tables.ORDER.USER_TYPE.eq(cmd.getUserType()));
            }
        }
        if(cmd.getUserName() != null) {
            if(condition == null) {
                condition = Tables.ORDER.USER_NAME.eq(cmd.getUserName());
            } else {
                condition = condition.and(Tables.ORDER.USER_NAME.eq(cmd.getUserName()));
            }
        }
        if(cmd.getSpecDesc() != null) {
            if(condition == null) {
                condition = Tables.ORDER.SPEC_DESC.eq(cmd.getSpecDesc());
            } else {
                condition = condition.and(Tables.ORDER.SPEC_DESC.eq(cmd.getSpecDesc()));
            }
        }
        if(cmd.getProductId() != null) {
            if(condition == null) {
                condition = Tables.ORDER.PRODUCT_ID.eq(cmd.getProductId());
            } else {
                condition = condition.and(Tables.ORDER.PRODUCT_ID.eq(cmd.getProductId()));
            }
        }
        if(cmd.getComboId() != null) {
            if(condition == null) {
                condition = Tables.ORDER.COMBO_ID.eq(cmd.getComboId());
            } else {
                condition = condition.and(Tables.ORDER.COMBO_ID.eq(cmd.getComboId()));
            }
        }
        if(cmd.getShopId() != null) {
            if(condition == null) {
                condition = Tables.ORDER.SHOP_ID.eq(cmd.getShopId());
            } else {
                condition = condition.and(Tables.ORDER.SHOP_ID.eq(cmd.getShopId()));
            }
        }
        if(cmd.getShopName() != null) {
            if(condition == null) {
                condition = Tables.ORDER.SHOP_NAME.eq(cmd.getShopName());
            } else {
                condition = condition.and(Tables.ORDER.SHOP_NAME.eq(cmd.getShopName()));
            }
        }
        if(cmd.getPayType() != null) {
            if(condition == null) {
                condition = Tables.ORDER.PAY_TYPE.eq(cmd.getPayType());
            } else {
                condition = condition.and(Tables.ORDER.PAY_TYPE.eq(cmd.getPayType()));
            }
        }
        if(cmd.getComboAmount() != null) {
            if(condition == null) {
                condition = Tables.ORDER.COMBO_AMOUNT.eq(cmd.getComboAmount());
            } else {
                condition = condition.and(Tables.ORDER.COMBO_AMOUNT.eq(cmd.getComboAmount()));
            }
        }
        if(cmd.getComboNum() != null) {
            if(condition == null) {
                condition = Tables.ORDER.COMBO_NUM.eq(cmd.getComboNum());
            } else {
                condition = condition.and(Tables.ORDER.COMBO_NUM.eq(cmd.getComboNum()));
            }
        }
        if(cmd.getPostAmount() != null) {
            if(condition == null) {
                condition = Tables.ORDER.POST_AMOUNT.eq(cmd.getPostAmount());
            } else {
                condition = condition.and(Tables.ORDER.POST_AMOUNT.eq(cmd.getPostAmount()));
            }
        }
        if(cmd.getTotalAmount() != null) {
            if(condition == null) {
                condition = Tables.ORDER.TOTAL_AMOUNT.eq(cmd.getTotalAmount());
            } else {
                condition = condition.and(Tables.ORDER.TOTAL_AMOUNT.eq(cmd.getTotalAmount()));
            }
        }
        if(cmd.getPostAddr() != null) {
            if(condition == null) {
                condition = Tables.ORDER.POST_ADDR.eq(cmd.getPostAddr());
            } else {
                condition = condition.and(Tables.ORDER.POST_ADDR.eq(cmd.getPostAddr()));
            }
        }
        if(cmd.getPostCode() != null) {
            if(condition == null) {
                condition = Tables.ORDER.POST_CODE.eq(cmd.getPostCode());
            } else {
                condition = condition.and(Tables.ORDER.POST_CODE.eq(cmd.getPostCode()));
            }
        }
        if(cmd.getPostReceiver() != null) {
            if(condition == null) {
                condition = Tables.ORDER.POST_RECEIVER.eq(cmd.getPostReceiver());
            } else {
                condition = condition.and(Tables.ORDER.POST_RECEIVER.eq(cmd.getPostReceiver()));
            }
        }
        if(cmd.getPostTel() != null) {
            if(condition == null) {
                condition = Tables.ORDER.POST_TEL.eq(cmd.getPostTel());
            } else {
                condition = condition.and(Tables.ORDER.POST_TEL.eq(cmd.getPostTel()));
            }
        }
        if(cmd.getLogisticsId() != null) {
            if(condition == null) {
                condition = Tables.ORDER.LOGISTICS_ID.eq(cmd.getLogisticsId());
            } else {
                condition = condition.and(Tables.ORDER.LOGISTICS_ID.eq(cmd.getLogisticsId()));
            }
        }
        if(cmd.getLogisticsCode() != null) {
            if(condition == null) {
                condition = Tables.ORDER.LOGISTICS_CODE.eq(cmd.getLogisticsCode());
            } else {
                condition = condition.and(Tables.ORDER.LOGISTICS_CODE.eq(cmd.getLogisticsCode()));
            }
        }
        if(cmd.getLogisticsTime() != null) {
            if(condition == null) {
                condition = Tables.ORDER.LOGISTICS_TIME.eq(cmd.getLogisticsTime());
            } else {
                condition = condition.and(Tables.ORDER.LOGISTICS_TIME.eq(cmd.getLogisticsTime()));
            }
        }
        if(cmd.getReceiptTime() != null) {
            if(condition == null) {
                condition = Tables.ORDER.RECEIPT_TIME.eq(cmd.getReceiptTime());
            } else {
                condition = condition.and(Tables.ORDER.RECEIPT_TIME.eq(cmd.getReceiptTime()));
            }
        }
        if(cmd.getBuyerWords() != null) {
            if(condition == null) {
                condition = Tables.ORDER.BUYER_WORDS.eq(cmd.getBuyerWords());
            } else {
                condition = condition.and(Tables.ORDER.BUYER_WORDS.eq(cmd.getBuyerWords()));
            }
        }
        if(cmd.getCancelReson() != null) {
            if(condition == null) {
                condition = Tables.ORDER.CANCEL_RESON.eq(cmd.getCancelReson());
            } else {
                condition = condition.and(Tables.ORDER.CANCEL_RESON.eq(cmd.getCancelReson()));
            }
        }
        if(cmd.getRemark() != null) {
            if(condition == null) {
                condition = Tables.ORDER.REMARK.eq(cmd.getRemark());
            } else {
                condition = condition.and(Tables.ORDER.REMARK.eq(cmd.getRemark()));
            }
        }
        if(cmd.getOrderStatus() != null) {
            if(condition == null) {
                condition = Tables.ORDER.ORDER_STATUS.eq(cmd.getOrderStatus());
            } else {
                condition = condition.and(Tables.ORDER.ORDER_STATUS.eq(cmd.getOrderStatus()));
            }
        }
        if(cmd.getStatus() != null) {
            if(condition == null) {
                condition = Tables.ORDER.STATUS.eq(cmd.getStatus());
            } else {
                condition = condition.and(Tables.ORDER.STATUS.eq(cmd.getStatus()));
            }
        }
        if(cmd.getCreateTime() != null) {
            if(condition == null) {
                condition = Tables.ORDER.CREATE_TIME.eq(cmd.getCreateTime());
            } else {
                condition = condition.and(Tables.ORDER.CREATE_TIME.eq(cmd.getCreateTime()));
            }
        }
        if(cmd.getUpdateTime() != null) {
            if(condition == null) {
                condition = Tables.ORDER.UPDATE_TIME.eq(cmd.getUpdateTime());
            } else {
                condition = condition.and(Tables.ORDER.UPDATE_TIME.eq(cmd.getUpdateTime()));
            }
        }
        if(cmd.getFinalStatus() != null) {
            if(condition == null) {
                condition = Tables.ORDER.FINAL_STATUS.eq(cmd.getFinalStatus());
            } else {
                condition = condition.and(Tables.ORDER.FINAL_STATUS.eq(cmd.getFinalStatus()));
            }
        }
        if(cmd.getSourceId() != null) {
            if(condition == null) {
                condition = Tables.ORDER.SOURCE_ID.eq(cmd.getSourceId());
            } else {
                condition = condition.and(Tables.ORDER.SOURCE_ID.eq(cmd.getSourceId()));
            }
        }
        if(cmd.getSourceType() != null) {
            if(condition == null) {
                condition = Tables.ORDER.SOURCE_TYPE.eq(cmd.getSourceType());
            } else {
                condition = condition.and(Tables.ORDER.SOURCE_TYPE.eq(cmd.getSourceType()));
            }
        }
        if(cmd.getSellerWords() != null) {
            if(condition == null) {
                condition = Tables.ORDER.SELLER_WORDS.eq(cmd.getSellerWords());
            } else {
                condition = condition.and(Tables.ORDER.SELLER_WORDS.eq(cmd.getSellerWords()));
            }
        }
        if(cmd.getService() != null) {
            if(condition == null) {
                condition = Tables.ORDER.SERVICE.eq(cmd.getService());
            } else {
                condition = condition.and(Tables.ORDER.SERVICE.eq(cmd.getService()));
            }
        }
        if(cmd.getOpId() != null) {
            if(condition == null) {
                condition = Tables.ORDER.OP_ID.eq(cmd.getOpId());
            } else {
                condition = condition.and(Tables.ORDER.OP_ID.eq(cmd.getOpId()));
            }
        }
        if(cmd.getOpTime() != null) {
            if(condition == null) {
                condition = Tables.ORDER.OP_TIME.eq(cmd.getOpTime());
            } else {
                condition = condition.and(Tables.ORDER.OP_TIME.eq(cmd.getOpTime()));
            }
        }
        if(cmd.getCancelRemark() != null) {
            if(condition == null) {
                condition = Tables.ORDER.CANCEL_REMARK.eq(cmd.getCancelRemark());
            } else {
                condition = condition.and(Tables.ORDER.CANCEL_REMARK.eq(cmd.getCancelRemark()));
            }
        }
        if(cmd.getUrgCnt() != null) {
            if(condition == null) {
                condition = Tables.ORDER.URG_CNT.eq(cmd.getUrgCnt());
            } else {
                condition = condition.and(Tables.ORDER.URG_CNT.eq(cmd.getUrgCnt()));
            }
        }
        if(cmd.getProductName() != null) {
            if(condition == null) {
                condition = Tables.ORDER.PRODUCT_NAME.eq(cmd.getProductName());
            } else {
                condition = condition.and(Tables.ORDER.PRODUCT_NAME.eq(cmd.getProductName()));
            }
        }
        if(cmd.getRepeat() != null) {
            if(condition == null) {
                condition = Tables.ORDER.REPEAT.eq(cmd.getRepeat());
            } else {
                condition = condition.and(Tables.ORDER.REPEAT.eq(cmd.getRepeat()));
            }
        }
        if(cmd.getLogisticsDetail() != null) {
            if(condition == null) {
                condition = Tables.ORDER.LOGISTICS_DETAIL.eq(cmd.getLogisticsDetail());
            } else {
                condition = condition.and(Tables.ORDER.LOGISTICS_DETAIL.eq(cmd.getLogisticsDetail()));
            }
        }
        if(cmd.getAttention() != null) {
            if(condition == null) {
                condition = Tables.ORDER.ATTENTION.eq(cmd.getAttention());
            } else {
                condition = condition.and(Tables.ORDER.ATTENTION.eq(cmd.getAttention()));
            }
        }
        if(cmd.getTelArea() != null) {
            if(condition == null) {
                condition = Tables.ORDER.TEL_AREA.eq(cmd.getTelArea());
            } else {
                condition = condition.and(Tables.ORDER.TEL_AREA.eq(cmd.getTelArea()));
            }
        }
        if(cmd.getComboName() != null) {
            if(condition == null) {
                condition = Tables.ORDER.COMBO_NAME.eq(cmd.getComboName());
            } else {
                condition = condition.and(Tables.ORDER.COMBO_NAME.eq(cmd.getComboName()));
            }
        }
        if(cmd.getIsFollowArbitration() != null) {
            if(condition == null) {
                condition = Tables.ORDER.IS_FOLLOW_ARBITRATION.eq(cmd.getIsFollowArbitration());
            } else {
                condition = condition.and(Tables.ORDER.IS_FOLLOW_ARBITRATION.eq(cmd.getIsFollowArbitration()));
            }
        }
        if(cmd.getAftersale() != null) {
            if(condition == null) {
                condition = Tables.ORDER.AFTERSALE.eq(cmd.getAftersale());
            } else {
                condition = condition.and(Tables.ORDER.AFTERSALE.eq(cmd.getAftersale()));
            }
        }
        if(cmd.getProduct() != null) {
            if(condition == null) {
                condition = Tables.ORDER.PRODUCT.eq(cmd.getProduct());
            } else {
                condition = condition.and(Tables.ORDER.PRODUCT.eq(cmd.getProduct()));
            }
        }
        query.addConditions(condition);
    }

}
