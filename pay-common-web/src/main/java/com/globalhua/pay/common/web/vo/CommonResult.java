package com.globalhua.pay.common.web.vo;

/**
 * WEB通用返回结果
 * @param <T>
 */
public class CommonResult<T> {

    public static final int SUCCESS = 1000;
    public static final int DEFAULT_ERROR = -1;


    protected int code = SUCCESS;

    protected String msg;

    protected T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> CommonResult<T> ok() {
        CommonResult<T> result = new CommonResult<>();
        return result;
    }

    public static <T> CommonResult<T> ok(T data) {
        CommonResult<T> result = new CommonResult<>();
        result.data = data;
        return result;
    }

    public static <T> CommonResult<T> error(int code, String msg) {
        CommonResult<T> result = new CommonResult<>();
        result.code = code;
        result.msg = msg;
        return result;
    }

    public static <T> CommonResult<T> error(String msg) {
        CommonResult<T> result = new CommonResult<>();
        result.code = DEFAULT_ERROR;
        result.msg = msg;
        return result;
    }
}
