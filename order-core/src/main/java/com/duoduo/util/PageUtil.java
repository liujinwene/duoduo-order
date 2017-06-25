package com.duoduo.util;

public class PageUtil {
	private static final Integer defaultPageNo = 1;
	private static final Integer defaultPageSize = 20;
	
	
	public static Integer getPageNo(Integer pageNo) {
		return pageNo==null ? defaultPageNo : pageNo;
	}
	
	public static Integer getPageSize(Integer pageSize) {
		return pageSize==null ? defaultPageSize : pageSize;
	}
	
	public static Integer getOffset(Integer pageNo, Integer pageSize) {
		return (pageNo-1)*pageSize;
	}
	
	public static boolean hasNext(Integer pageNo, Integer pageSize, Integer total) {
		return getOffset(pageNo+1, pageSize)<total;
	}

}
