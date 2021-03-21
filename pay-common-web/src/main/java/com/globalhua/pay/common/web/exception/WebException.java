package com.globalhua.pay.common.web.exception;

import com.globalhua.pay.common.exception.BizException;

public class WebException extends BizException {

    private static final long serialVersionUID = 1L;

    /**
     * 请求体解密失败
     */
    public static final BizException DECRYPT_REQUEST_BODY_EXCEPTION = new WebException(90050001, "请求体解密出错");

    public WebException(int code, String msgFormat, Object... args) {
        super(code, msgFormat, args);
    }
}
