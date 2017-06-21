package com.duoduo.order.cmd;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public class ListOrderByCdCmd {
    private Long id;
    private Byte innerStatus;
    private Date innerCreateTime;
    private Date innerUpdateTime;
    private String orderId;
    private String userId;
    private String userType;
    private String userName;
    private String specDesc;
    private String productId;
    private String comboId;
    private String shopId;
    private String shopName;
    private String payType;
    private String comboAmount;
    private String comboNum;
    private String postAmount;
    private String totalAmount;
    private String postAddr;
    private String postCode;
    private String postReceiver;
    private String postTel;
    private String logisticsId;
    private String logisticsCode;
    private String logisticsTime;
    private String receiptTime;
    private String buyerWords;
    private String cancelReson;
    private String remark;
    private String orderStatus;
    private String status;
    private String createTime;
    private String updateTime;
    private String finalStatus;
    private String sourceId;
    private String sourceType;
    private String sellerWords;
    private String service;
    private String opId;
    private String opTime;
    private String cancelRemark;
    private String urgCnt;
    private String productName;
    private String repeat;
    private String logisticsDetail;
    private String attention;
    private String telArea;
    private String comboName;
    private String isFollowArbitration;
    private String aftersale;
    private String product;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Byte getInnerStatus() {
        return innerStatus;
    }
    public void setInnerStatus(Byte innerStatus) {
        this.innerStatus = innerStatus;
    }

    public Date getInnerCreateTime() {
        return innerCreateTime;
    }
    public void setInnerCreateTime(Date innerCreateTime) {
        this.innerCreateTime = innerCreateTime;
    }

    public Date getInnerUpdateTime() {
        return innerUpdateTime;
    }
    public void setInnerUpdateTime(Date innerUpdateTime) {
        this.innerUpdateTime = innerUpdateTime;
    }

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSpecDesc() {
        return specDesc;
    }
    public void setSpecDesc(String specDesc) {
        this.specDesc = specDesc;
    }

    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getComboId() {
        return comboId;
    }
    public void setComboId(String comboId) {
        this.comboId = comboId;
    }

    public String getShopId() {
        return shopId;
    }
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getPayType() {
        return payType;
    }
    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getComboAmount() {
        return comboAmount;
    }
    public void setComboAmount(String comboAmount) {
        this.comboAmount = comboAmount;
    }

    public String getComboNum() {
        return comboNum;
    }
    public void setComboNum(String comboNum) {
        this.comboNum = comboNum;
    }

    public String getPostAmount() {
        return postAmount;
    }
    public void setPostAmount(String postAmount) {
        this.postAmount = postAmount;
    }

    public String getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPostAddr() {
        return postAddr;
    }
    public void setPostAddr(String postAddr) {
        this.postAddr = postAddr;
    }

    public String getPostCode() {
        return postCode;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPostReceiver() {
        return postReceiver;
    }
    public void setPostReceiver(String postReceiver) {
        this.postReceiver = postReceiver;
    }

    public String getPostTel() {
        return postTel;
    }
    public void setPostTel(String postTel) {
        this.postTel = postTel;
    }

    public String getLogisticsId() {
        return logisticsId;
    }
    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getLogisticsCode() {
        return logisticsCode;
    }
    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public String getLogisticsTime() {
        return logisticsTime;
    }
    public void setLogisticsTime(String logisticsTime) {
        this.logisticsTime = logisticsTime;
    }

    public String getReceiptTime() {
        return receiptTime;
    }
    public void setReceiptTime(String receiptTime) {
        this.receiptTime = receiptTime;
    }

    public String getBuyerWords() {
        return buyerWords;
    }
    public void setBuyerWords(String buyerWords) {
        this.buyerWords = buyerWords;
    }

    public String getCancelReson() {
        return cancelReson;
    }
    public void setCancelReson(String cancelReson) {
        this.cancelReson = cancelReson;
    }

    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getFinalStatus() {
        return finalStatus;
    }
    public void setFinalStatus(String finalStatus) {
        this.finalStatus = finalStatus;
    }

    public String getSourceId() {
        return sourceId;
    }
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceType() {
        return sourceType;
    }
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getSellerWords() {
        return sellerWords;
    }
    public void setSellerWords(String sellerWords) {
        this.sellerWords = sellerWords;
    }

    public String getService() {
        return service;
    }
    public void setService(String service) {
        this.service = service;
    }

    public String getOpId() {
        return opId;
    }
    public void setOpId(String opId) {
        this.opId = opId;
    }

    public String getOpTime() {
        return opTime;
    }
    public void setOpTime(String opTime) {
        this.opTime = opTime;
    }

    public String getCancelRemark() {
        return cancelRemark;
    }
    public void setCancelRemark(String cancelRemark) {
        this.cancelRemark = cancelRemark;
    }

    public String getUrgCnt() {
        return urgCnt;
    }
    public void setUrgCnt(String urgCnt) {
        this.urgCnt = urgCnt;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getRepeat() {
        return repeat;
    }
    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    public String getLogisticsDetail() {
        return logisticsDetail;
    }
    public void setLogisticsDetail(String logisticsDetail) {
        this.logisticsDetail = logisticsDetail;
    }

    public String getAttention() {
        return attention;
    }
    public void setAttention(String attention) {
        this.attention = attention;
    }

    public String getTelArea() {
        return telArea;
    }
    public void setTelArea(String telArea) {
        this.telArea = telArea;
    }

    public String getComboName() {
        return comboName;
    }
    public void setComboName(String comboName) {
        this.comboName = comboName;
    }

    public String getIsFollowArbitration() {
        return isFollowArbitration;
    }
    public void setIsFollowArbitration(String isFollowArbitration) {
        this.isFollowArbitration = isFollowArbitration;
    }

    public String getAftersale() {
        return aftersale;
    }
    public void setAftersale(String aftersale) {
        this.aftersale = aftersale;
    }

    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }

}
