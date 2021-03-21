package com.globalhua.pay.web.portal.exception;

import com.globalhua.pay.common.exception.BizException;

public class PortalException extends BizException {

    private static final long serialVersionUID = 1L;

    public static final PortalException SMS_AUTH_CODE_ERROR = new PortalException(80100501,"短信验证码错误");

    public PortalException() {
    }

    public PortalException(String message) {
        super(-1,message);
    }

    public PortalException(int code, String msgFormat, Object... args) {
        super(code, msgFormat, args);
    }
}
