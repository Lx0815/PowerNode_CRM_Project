package com.D.crm.commond.contants;

/**
 * @author: Ding
 * @date: 2022/10/1 9:19
 * @description:
 * @modify:
 */


public class Constants {

    private Constants() {}


    /**
     * session 中存放 当前用户 的 key
     */
    public static final String SESSION_USER = "sessionUser";

    /**
     * Cookie 中存放 当前用户的 loginAct 的 key
     */
    public static final String LOGIN_ACT = "loginAct";
    /**
     * Cookie 中存放 当前用户的 loginPwd 的 key
     */
    public static final String LOGIN_PWD = "loginPwd";

    public static final String IS_REMEMBER_PASSWORD = "isRemPwd";
    /**
     * 十天。是单位为 秒 的时间常量
     */
    public static final int TEN_DAY = 864000;
}
