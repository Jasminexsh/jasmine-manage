package com.jasmine.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author xieshanghan
 * @version Base64UtilTest.java, v 0.1 2023年08月07日 22:04 xieshanghan
 */
public class Base64UtilTest {

    private String originKey = "base64-test-origin-key";

    @Test
    public void testBase64Encode() {
        System.out.println("originKey: " + originKey);
        String encryptedKey = Base64Util.encodeFromOriginKey(originKey);
        System.out.println("encryptedKey: " + encryptedKey);
        String decryptedKey = Base64Util.decodeFromEncryptedKey(encryptedKey);
        System.out.println("decryptedKey: " + decryptedKey);
        Assert.assertEquals(decryptedKey, originKey);
    }

}