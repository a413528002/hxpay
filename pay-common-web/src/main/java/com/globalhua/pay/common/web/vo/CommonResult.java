package com.globalhua.pay.common.web.vo;

/**
 * WEB通用返回结果
 * @param <T>
 */
public class CommonResult<T> {

    /**
     * 成功结果编码
     */
    public static final int SUCCESS = 1000;
    /**
     * 默认错误编码
     */
    public static final int DEFAULT_ERROR = -1;

    /**
     * 结果编码
     */
    protected int code = SUCCESS;

    /**
     * 结果信息
     */
    protected String msg;

    /**
     * 结果数据
     */
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
