package com.D.crm.commond.utils;

import com.D.crm.commond.contants.Constants;
import org.springframework.util.ObjectUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author: Ding
 * @date: 2022/10/1 10:15
 * @description:
 * @modify:
 */


public class CookieBuilder {

    private Cookie cookie;

    private static Base64.Encoder encoder;

    private static Base64.Decoder decoder;

    private CookieBuilder() {}

    public CookieBuilder(String key, String value) {
        cookie = new Cookie(key, value);
    }

    /**
     * 创建一个 CookieBuilder
     *
     * @param key      cookie 的键
     * @param value    cookie 的值
     * @param isEncode 是否对 Cookie 的 value 进行加密
     * @return 返回一个 CookieBuilder 对象
     */
    public static CookieBuilder createCookie(String key, String value, boolean isEncode) {
        if (isEncode) {
            value = encode(value);
        }
        return new CookieBuilder(key, value);
    }

    /**
     * 从 response 中移除 Cookie
     *
     * @param response 响应对象
     * @param key cookie 的键
     */
    public static void removeCookie(HttpServletResponse response, String key) {
        response.addCookie(CookieBuilder.createCookie(key, "1", false)
                                .setMaxAge(0)
                                .getCookie());
    }

    private static String encode(String str) {
        return Base64Utils.encode(str);
    }

    public static String decode(String value) {
        return Base64Utils.decode(value);
    }


    /**
     * 设置 cookie 的最大存活时间，单位 秒
     *
     * @param age 最大存活时间（单位 秒）
     * @return 返回当前的 CookieBuilder 对象
     */
    public CookieBuilder setMaxAge(int age) {
        if (ObjectUtils.isEmpty(cookie)) throw new RuntimeException("Cookie 不存在");
        cookie.setMaxAge(age);
        return this;
    }

    public Cookie getCookie() {
        return cookie;
    }

    public void setCookie(Cookie cookie) {
        this.cookie = cookie;
    }
}
