package com.duoduo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.duoduo.base.exception.RestRunningException;

public class Assert {
	private static final Logger LOGGER  = LoggerFactory.getLogger(Assert.class);
	
	public static void notNull(Object value, String log) {
		if(value == null) {
			LOGGER.error(log);
			throw RestRunningException.error(log);
		}
	}
	
	public static void notNull(Object value, String log, String userLog) {
		if(value == null) {
			LOGGER.error(log);
			throw RestRunningException.error(userLog);
		}
	}

}
