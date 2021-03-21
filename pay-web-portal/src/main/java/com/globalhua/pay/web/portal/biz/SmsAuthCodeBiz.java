package com.globalhua.pay.web.portal.biz;

import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.RandomUtil;
import com.globalhua.pay.common.exception.BizException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 短信验证码业务
 */
@Component
public class SmsAuthCodeBiz {

    /**
     * 登录
     */
    public static final String BIZ_TYPE_SIGN_IN = "SIGN_IN";

    /**
     * 重置密码
     */
    public static final String BIZ_TYPE_RESET_PASSWORD = "RESET_PWD";

    /**
     * 重置支付密码
     */
    public static final String BIZ_TYPE_RESET_PAY_PASSWORD = "RESET_PAY_PWD";

    /**
     * 所有业务集合
     */
    public static final Set<String> BIZ_TYPE_SET = Stream.of(
            BIZ_TYPE_SIGN_IN,
            BIZ_TYPE_RESET_PASSWORD,
            BIZ_TYPE_RESET_PAY_PASSWORD
    ).collect(Collectors.toSet());

    private static final String SESSION_KEY_AUTH_CODE = "_SMS_AUTH_CODE";

    @Resource
    private HttpServletRequest request;

    /**
     * 发送短信
     * @param phoneNumber 手机号码
     * @param bizType 业务类型
     */
    public void sendSms(String phoneNumber, String bizType) throws BizException {

        validateParam(phoneNumber, bizType);

        String authCode = generateAuthCode();

//        String sessionValue = sessionValue(request.getUserPrincipal().getName());

//        request.getSession().setAttribute(SESSION_KEY_AUTH_CODE, sessionValue);

    }

    /**
     * 校验短信验证码
     * @param phoneNumber 手机号
     * @param bizType 业务类型
     * @param authCode 验证码
     * @throws BizException
     */
    public void checkAuthCode(String phoneNumber, String bizType, String authCode) throws BizException {
        validateParam(phoneNumber, bizType);

    }


    private String sessionValue(String phoneNumber, String code) {
        return null;
    }

    private String generateAuthCode() {
        return RandomUtil.randomNumbers(6);
    }

    private void validateParam(String phoneNumber, String bizType) {
        if (!Validator.isMobile(phoneNumber)) {
            throw BizException.PARAMETER_VALIDATE_EXCEPTION.newInstance("手机号格式错误");
        }

        if (!BIZ_TYPE_SET.contains(bizType)) {
            throw BizException.PARAMETER_VALIDATE_EXCEPTION.newInstance("短信验证码业务业务类型错误");
        }
    }
}
