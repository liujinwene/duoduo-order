package com.duoduo.util;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonUtil {
	private static final String dateFormatter = "yyyy-MM-dd HH:mm:ss";
	private static final Gson gson = new GsonBuilder().setDateFormat(dateFormatter).create();
	
	
	public static String toJson(Object object) {
		return gson.toJson(object);
	}
	
	public static <T> T fromJson(String json, Class<T> classOfT) {
		return gson.fromJson(json, classOfT);
	}
	
	public static <T> T fromJson(String json, Type typeOfT) {
		return gson.fromJson(json, typeOfT);
	}

}
