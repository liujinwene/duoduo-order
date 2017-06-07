package com.duoduo.thirdorder.resp;

import java.util.List;

public class ThirdOrderResp {
	private SubThirdOrder order;
//	private List<SubAftersale> aftersale;
	private List<String> aftersale;
	private SubProduct product;
	
	public SubThirdOrder getOrder() {
		return order;
	}
	public void setOrder(SubThirdOrder order) {
		this.order = order;
	}
	public List<String> getAftersale() {
		return aftersale;
	}
	public void setAftersale(List<String> aftersale) {
		this.aftersale = aftersale;
	}
	public SubProduct getProduct() {
		return product;
	}
	public void setProduct(SubProduct product) {
		this.product = product;
	}
	
}
