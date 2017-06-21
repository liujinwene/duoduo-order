package com.duoduo.retreat.cmd;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public class ListRetreatGoodByCdCmd {
    private Long id;
    private Byte status;
    private String orderId;
    private String expressOrderNo;
    private String expressCompanyName;
    private String retreatReason;
    private BigDecimal expressAmount;
    private BigDecimal retreatAmount;
    private String remark;
    private Date createTime;
    private Date updateTime;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Byte getStatus() {
        return status;
    }
    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getExpressOrderNo() {
        return expressOrderNo;
    }
    public void setExpressOrderNo(String expressOrderNo) {
        this.expressOrderNo = expressOrderNo;
    }

    public String getExpressCompanyName() {
        return expressCompanyName;
    }
    public void setExpressCompanyName(String expressCompanyName) {
        this.expressCompanyName = expressCompanyName;
    }

    public String getRetreatReason() {
        return retreatReason;
    }
    public void setRetreatReason(String retreatReason) {
        this.retreatReason = retreatReason;
    }

    public BigDecimal getExpressAmount() {
        return expressAmount;
    }
    public void setExpressAmount(BigDecimal expressAmount) {
        this.expressAmount = expressAmount;
    }

    public BigDecimal getRetreatAmount() {
        return retreatAmount;
    }
    public void setRetreatAmount(BigDecimal retreatAmount) {
        this.retreatAmount = retreatAmount;
    }

    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
