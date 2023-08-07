package com.jasmine.util;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Base64工具类
 *
 * @author xieshanghan
 * @version Base64Util.java, v 0.1 2023年08月07日 21:56 xieshanghan
 */
public class Base64Util {

    public static String encodeFromOriginKey(String originKey) {
        byte[] bytes = originKey.getBytes(StandardCharsets.UTF_8);
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static String decodeFromEncryptedKey(String encryptedKey) {
        byte[] bytes = Base64.getDecoder().decode(encryptedKey);
        return new String(bytes);
    }

}