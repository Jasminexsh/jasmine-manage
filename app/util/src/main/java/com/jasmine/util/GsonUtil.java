package com.jasmine.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Google Gson工具类
 *
 * @author xieshanghan
 * @version GsonUtil.java, v 0.1 2023年10月12日 20:58 xieshanghan
 */
public class GsonUtil {

    private static final Gson gson = new GsonBuilder().create();

    public static String toJson(Object obj) {
        return gson.toJson(obj);
    }

    public static <T> T fromJson(String json, Class<T> claZz) {
        return gson.fromJson(json, claZz);
    }

}