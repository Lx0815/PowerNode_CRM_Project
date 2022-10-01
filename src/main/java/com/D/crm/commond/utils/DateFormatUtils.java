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

    /**
     * 默认的日期时间模式
     */
    public static final String DEFAULT_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 默认日期模式
     */
    public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";

    /**
     * 默认事件模式
     */
    public static final String DEFAULT_TIME_PATTERN = "HH:mm:ss";

    /**
     * 默认日期时间格式的 SimpleDateFormat 对象
     */
    public static SimpleDateFormat DEFAULT_DATE_TIME_FORMAT;

    /**
     * 默认日期格式的 SimpleDateFormat 对象
     */
    public static SimpleDateFormat DEFAULT_DATE_FORMAT;

    /**
     * 默认时间格式的 SimpleDateFormat 对象
     */
    public static SimpleDateFormat DEFAULT_TIME_FORMAT;

    /*
      静态初始化
     */
    static {
        DEFAULT_DATE_TIME_FORMAT = new SimpleDateFormat(DEFAULT_DATETIME_PATTERN);
        DEFAULT_DATE_FORMAT = new SimpleDateFormat(DEFAULT_DATE_PATTERN);
        DEFAULT_TIME_FORMAT = new SimpleDateFormat(DEFAULT_TIME_PATTERN);
    }

    /**
     * 按照本项目默认的格式化方式（yyyy-MM-dd HH:mm:ss）获取当前时间的描述字符串
     *
     * @return
     */
    public static String getNowDateTimeString() {
        return getDateTimeStringByDate(new Date());
    }

    public static String getDateTimeStringByDate(Date date) {
        return DEFAULT_DATE_TIME_FORMAT.format(date);
    }

    /**
     * 按照本项目默认的格式化方式（yyyy-MM-dd）获取当前时间的描述字符串
     *
     * @return
     */
    public static String getNowDateString() {
        return getDateStringByDate(new Date());
    }

    public static String getDateStringByDate(Date date) {
        return DEFAULT_DATE_FORMAT.format(date);
    }

    /**
     * 按照本项目默认的格式化方式（HH:mm:ss）获取当前时间的描述字符串
     *
     * @return
     */
    public static String getNowTimeString() {
        return getTimeStringByDate(new Date());
    }

    public static String getTimeStringByDate(Date date) {
        return DEFAULT_TIME_FORMAT.format(date);
    }
}
