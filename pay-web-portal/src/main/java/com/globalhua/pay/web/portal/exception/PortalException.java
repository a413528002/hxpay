package com.globalhua.pay.web.portal.exception;

import com.globalhua.pay.common.exception.BizException;

public class PortalException extends BizException {

    private static final long serialVersionUID = 1L;

    public static final PortalException SMS_SEND_ERROR = new PortalException(80100501,"短信发送失败");
    public static final PortalException SMS_AUTH_CODE_NOT_FOUND = new PortalException(80100503,"验证码错误");
    public static final PortalException SMS_AUTH_CODE_ERROR = new PortalException(80100504,"验证码错误");
    public static final PortalException SMS_AUTH_PHONE_NUMBER_ERROR = new PortalException(80100505,"手机号错误");
    public static final PortalException SMS_AUTH_CODE_EXPIRED = new PortalException(80100506,"验证码已过期");

    public static final PortalException PRINCIPAL_PHONE_NUMBER_NOT_FOUND = new PortalException(80100203,"获取当前用户手机号失败");

    public PortalException() {
    }

    public PortalException(String message) {
        super(-1,message);
    }

    public PortalException(int code, String msgFormat, Object... args) {
        super(code, msgFormat, args);
    }
}
