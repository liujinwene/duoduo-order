package com.duoduo.base.resp;

import com.duoduo.util.PageUtil;

public class PageResp {
	private Boolean hasNext;
	private Integer pageNo;
	private Integer pageSize;
	private Integer total;
	private Object rows;
	
	public PageResp(Integer pageNo, Integer pageSize, Integer total) {
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.total = total;
		this.hasNext = PageUtil.hasNext(pageNo, pageSize, total);
	}
	
	public Boolean getHasNext() {
		return hasNext;
	}
	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Object getRows() {
		return rows;
	}
	public void setRows(Object rows) {
		this.rows = rows;
	}

}
