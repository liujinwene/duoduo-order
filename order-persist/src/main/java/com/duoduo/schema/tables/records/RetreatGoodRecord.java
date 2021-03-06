/**
 * This class is generated by jOOQ
 */
package com.duoduo.schema.tables.records;


import com.duoduo.schema.tables.RetreatGood;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RetreatGoodRecord extends UpdatableRecordImpl<RetreatGoodRecord> implements Record11<Long, Byte, String, String, String, String, BigDecimal, BigDecimal, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1792872304;

    /**
     * Setter for <code>duoduo_order.retreat_good.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>duoduo_order.retreat_good.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>duoduo_order.retreat_good.status</code>. 0-其他原因,1-退货中,2-已退货,3-已退款
     */
    public void setStatus(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>duoduo_order.retreat_good.status</code>. 0-其他原因,1-退货中,2-已退货,3-已退款
     */
    public Byte getStatus() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>duoduo_order.retreat_good.order_id</code>.
     */
    public void setOrderId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>duoduo_order.retreat_good.order_id</code>.
     */
    public String getOrderId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>duoduo_order.retreat_good.express_order_no</code>. 快递单号
     */
    public void setExpressOrderNo(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>duoduo_order.retreat_good.express_order_no</code>. 快递单号
     */
    public String getExpressOrderNo() {
        return (String) get(3);
    }

    /**
     * Setter for <code>duoduo_order.retreat_good.express_company_name</code>. 快递公司
     */
    public void setExpressCompanyName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>duoduo_order.retreat_good.express_company_name</code>. 快递公司
     */
    public String getExpressCompanyName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>duoduo_order.retreat_good.retreat_reason</code>. 退货原因
     */
    public void setRetreatReason(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>duoduo_order.retreat_good.retreat_reason</code>. 退货原因
     */
    public String getRetreatReason() {
        return (String) get(5);
    }

    /**
     * Setter for <code>duoduo_order.retreat_good.express_amount</code>. 快递费
     */
    public void setExpressAmount(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>duoduo_order.retreat_good.express_amount</code>. 快递费
     */
    public BigDecimal getExpressAmount() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>duoduo_order.retreat_good.retreat_amount</code>. 退款金额
     */
    public void setRetreatAmount(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>duoduo_order.retreat_good.retreat_amount</code>. 退款金额
     */
    public BigDecimal getRetreatAmount() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>duoduo_order.retreat_good.remark</code>. 备注
     */
    public void setRemark(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>duoduo_order.retreat_good.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(8);
    }

    /**
     * Setter for <code>duoduo_order.retreat_good.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>duoduo_order.retreat_good.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>duoduo_order.retreat_good.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>duoduo_order.retreat_good.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Byte, String, String, String, String, BigDecimal, BigDecimal, String, Timestamp, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Byte, String, String, String, String, BigDecimal, BigDecimal, String, Timestamp, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return RetreatGood.RETREAT_GOOD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return RetreatGood.RETREAT_GOOD.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return RetreatGood.RETREAT_GOOD.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return RetreatGood.RETREAT_GOOD.EXPRESS_ORDER_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return RetreatGood.RETREAT_GOOD.EXPRESS_COMPANY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return RetreatGood.RETREAT_GOOD.RETREAT_REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return RetreatGood.RETREAT_GOOD.EXPRESS_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return RetreatGood.RETREAT_GOOD.RETREAT_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return RetreatGood.RETREAT_GOOD.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return RetreatGood.RETREAT_GOOD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return RetreatGood.RETREAT_GOOD.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value2() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getExpressOrderNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getExpressCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRetreatReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getExpressAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getRetreatAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RetreatGoodRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RetreatGoodRecord value2(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RetreatGoodRecord value3(String value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RetreatGoodRecord value4(String value) {
        setExpressOrderNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RetreatGoodRecord value5(String value) {
        setExpressCompanyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RetreatGoodRecord value6(String value) {
        setRetreatReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RetreatGoodRecord value7(BigDecimal value) {
        setExpressAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RetreatGoodRecord value8(BigDecimal value) {
        setRetreatAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RetreatGoodRecord value9(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RetreatGoodRecord value10(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RetreatGoodRecord value11(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RetreatGoodRecord values(Long value1, Byte value2, String value3, String value4, String value5, String value6, BigDecimal value7, BigDecimal value8, String value9, Timestamp value10, Timestamp value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RetreatGoodRecord
     */
    public RetreatGoodRecord() {
        super(RetreatGood.RETREAT_GOOD);
    }

    /**
     * Create a detached, initialised RetreatGoodRecord
     */
    public RetreatGoodRecord(Long id, Byte status, String orderId, String expressOrderNo, String expressCompanyName, String retreatReason, BigDecimal expressAmount, BigDecimal retreatAmount, String remark, Timestamp createTime, Timestamp updateTime) {
        super(RetreatGood.RETREAT_GOOD);

        set(0, id);
        set(1, status);
        set(2, orderId);
        set(3, expressOrderNo);
        set(4, expressCompanyName);
        set(5, retreatReason);
        set(6, expressAmount);
        set(7, retreatAmount);
        set(8, remark);
        set(9, createTime);
        set(10, updateTime);
    }
}
