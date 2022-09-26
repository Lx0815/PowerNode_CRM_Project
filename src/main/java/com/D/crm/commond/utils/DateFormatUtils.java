package com.D.crm.commond.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Ding
 * @date: 2022/9/26 11:55
 * @description:
 * @modify:
 */


public class DateFormatUtils {

    private DateFormatUtils() {}

    public static final String DEFAULT_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";

    public static final String DEFAULT_TIME_PATTERN = "HH:mm:ss";

    /**
     * 按照本项目默认的格式化方式（yyyy-MM-dd HH:mm:ss）获取当前时间的描述字符串
     *
     * @return
     */
    public static String getNowDateTimeString() {
        return getNowDateTimeString(DEFAULT_DATETIME_PATTERN);
    }

    /**
     * 指定格式化方式获取当前时间的描述字符串
     *
     * @param pattern
     * @return
     */
    public static String getNowDateTimeString(String pattern) {
        return new SimpleDateFormat(pattern).format(new Date());
    }

}
