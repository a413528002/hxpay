package com.globalhua.pay.web.portal.biz;

import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.RandomUtil;
import com.globalhua.pay.common.exception.BizException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 短信验证码业务
 */
@Component
public class SmsAuthCodeBiz {

    public static final String BIZ_TYPE_SIGN_IN = "SIGN_IN";
    public static final String BIZ_TYPE_RESET_PASSWORD = "RESET_PWD";
    public static final String BIZ_TYPE_RESET_PAY_PASSWORD = "RESET_PAY_PWD";

    private static final String SESSION_KEY_AUTH_CODE = "_SMS_AUTH_CODE";

    @Resource
    private HttpServletRequest request;

    /**
     * 发送短信
     * @param phoneNumber 手机号码
     * @param bizType 业务类型
     */
    public void sendSms(String phoneNumber, String bizType) throws BizException {

        if (!Validator.isMobile(phoneNumber)) {
            throw BizException.PARAMETER_VALIDATE_EXCEPTION.newInstance("手机号格式错误");
        }

//        String authCode = generateAuthCode();

//        String sessionValue = sessionValue(request.getUserPrincipal().getName());

//        request.getSession().setAttribute(SESSION_KEY_AUTH_CODE, sessionValue);

    }

    public void checkAuthCode(String phoneNumber, String bizType, String authCode) throws BizException {

    }


    private String sessionValue(String phoneNumber, String code) {
        return null;
    }

    private String generateAuthCode() {
        return RandomUtil.randomNumbers(6);
    }
}
