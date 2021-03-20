package com.globalhua.pay.web.portal.exception;

import com.globalhua.pay.common.exception.BizException;

public class PortalException extends BizException {


    private static final long serialVersionUID = 1L;

    public PortalException() {
    }

    public PortalException(String message) {
        super(-1,message);
    }

    public PortalException(int code, String msgFormat, Object... args) {
        super(code, msgFormat, args);
    }
}
