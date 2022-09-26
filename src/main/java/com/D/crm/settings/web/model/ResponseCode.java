package com.D.crm.settings.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author: Ding
 * @date: 2022/7/18 14:36
 * @description:
 * @modify:
 */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ResponseCode {

    SUCCESS_CODE("20000"),

    FAIL_CODE("20010");


    private String code;

    ResponseCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
