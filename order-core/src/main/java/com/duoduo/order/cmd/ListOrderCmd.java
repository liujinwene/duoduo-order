package com.duoduo.order.cmd;

import com.duoduo.base.cmd.PageCmd;

public class ListOrderCmd  extends PageCmd {
	private String account;
	private String finalStatus;
	private String timestamp;
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getFinalStatus() {
		return finalStatus;
	}
	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}
