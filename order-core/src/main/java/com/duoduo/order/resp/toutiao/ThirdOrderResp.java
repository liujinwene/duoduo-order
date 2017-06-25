package com.duoduo.order.resp.toutiao;

public class ThirdOrderResp {
	private SubThirdOrder order;
	private Object aftersale;
	private Object product;
	
	public SubThirdOrder getOrder() {
		return order;
	}
	public void setOrder(SubThirdOrder order) {
		this.order = order;
	}
	public Object getAftersale() {
		return aftersale;
	}
	public void setAftersale(Object aftersale) {
		this.aftersale = aftersale;
	}
	public Object getProduct() {
		return product;
	}
	public void setProduct(Object product) {
		this.product = product;
	}
	
}
