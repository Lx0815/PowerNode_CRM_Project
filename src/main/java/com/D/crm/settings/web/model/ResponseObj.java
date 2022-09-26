package com.D.crm.settings.web.model;

/**
 * @author: Ding
 * @date: 2022/9/25 21:09
 * @description:
 * @modify:
 */


public class ResponseObj {

    private ResponseCode responseCode;

    private Object data;

    private String message;

    public ResponseObj() {
    }

    public ResponseObj(ResponseCode responseCode, Object data, String message) {
        this.responseCode = responseCode;
        this.data = data;
        this.message = message;
    }

    public ResponseObj(ResponseCode responseCode, String message) {
        this(responseCode, null, message);
    }

    public ResponseCode getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
