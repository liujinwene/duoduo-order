package com.duoduo.util;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

public class ConvertUtil {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConvertUtil.class);
	
	@SuppressWarnings("unchecked")
	public static <T> T convert(Object src, Class<T> destClz) {
		if (src == null || destClz == null) {
			return null;
		}
		
		if (src instanceof Map) {
			return convert((Map<String, Object>)src, destClz);
		}
		
		if (src.getClass() == destClz) {
			return (T) src;
		}
		
		try {
			T dest = destClz.newInstance();
			BeanUtils.copyProperties(src, dest);
			return dest;
		} catch (InstantiationException | IllegalAccessException e) {
			LOGGER.error("convert error: src="+src+", dest class="+destClz);
		}
		
		return null;
	}
	
	
}
