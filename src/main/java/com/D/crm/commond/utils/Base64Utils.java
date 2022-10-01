package com.D.crm.commond.utils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author: Ding
 * @date: 2022/10/1 14:45
 * @description:
 * @modify:
 */


public class Base64Utils {

    private Base64Utils() {}

    private static final String KEY = ".;[]'/";

    private static final Base64.Decoder decoder;

    private static final Base64.Encoder encoder;

    static {
        decoder = Base64.getDecoder();
        encoder = Base64.getEncoder();
    }

    public static String encode(String value) {
        return encoder.encodeToString((KEY + value + KEY).getBytes(StandardCharsets.UTF_8));
    }

    public static String decode(String value) {
        String result = new String(decoder.decode(value));
        return result.substring(KEY.length(), result.length() - KEY.length());
    }

}
