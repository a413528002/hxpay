package com.globalhua.pay.web.portal.biz;

import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.RandomUtil;
import com.globalhua.pay.common.exception.BizException;
import com.globalhua.pay.web.portal.constants.PortalConstants;
import com.globalhua.pay.web.portal.exception.PortalException;
import com.globalhua.pay.web.portal.security.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.concurrent.TimeUnit.MINUTES;

/**
 * 短信验证码业务
 */
@Component
public class SmsAuthCodeBiz {

    private static final Logger log = LoggerFactory.getLogger(SmsAuthCodeBiz.class);

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

    /**
     * 短信模板编号
     */
    private String tempCode = "";

    /**
     * 验证码有效时间，单位分钟
     */
    private int authCodeEffectiveMinute;

    /**
     * 验证码长度
     */
    private byte codeLength = 6;

    @Resource
    private SmsBiz smsBiz;

    @Resource
    private HttpServletRequest request;

    /**
     * 发送短信
     * @param phoneNumber 手机号码
     * @param bizType 业务类型
     */
    public void sendSms(String phoneNumber, String bizType) throws BizException {
        final String number = phoneNumber == null ? getPrincipalPhoneNumber() : phoneNumber;
        validateParam(number, bizType);
        String authCode = generateAuthCode();
        store(number, bizType, authCode);
        try {
            doSend(number, bizType, authCode);
        } catch (Exception e) {
            log.error("短信发送失败",e);
            throw PortalException.SMS_SEND_ERROR;
        }
    }

    /**
     * 校验短信验证码
     * @param phoneNumber 手机号
     * @param bizType 业务类型
     * @param authCode 验证码
     * @throws BizException
     */
    public void checkAuthCode(String phoneNumber, String bizType, String authCode) throws BizException {
        final String number = phoneNumber == null ? getPrincipalPhoneNumber() : phoneNumber;
        validateParam(number, bizType);
        check(phoneNumber, bizType, authCode);
    }

    protected void doSend(String number, String bizType, String authCode) {
        // TODO: 2021/3/24
        Map<String, Object> param = new HashMap<>();
        param.put("bizType",bizType); // TODO: 2021/3/24 中文
        param.put("code", authCode);
        param.put("minute", authCodeEffectiveMinute);
        smsBiz.sendSms(number, tempCode, param);
    }

    protected void store(String number, String bizType, String authCode) {
        long current = System.currentTimeMillis();
        String value = number + "&" + bizType + "&" + authCode + "&" + current;
        request.getSession().setAttribute(PortalConstants.SESSION_KEY_AUTH_CODE,value);
    }

    protected void check(String phoneNumber, String bizType, String authCode) {
        if (authCode == null || authCode.length() != codeLength) {
            throw PortalException.SMS_AUTH_CODE_ERROR;
        }
        String value = (String) request.getSession().getAttribute(PortalConstants.SESSION_KEY_AUTH_CODE);
        if (value == null) {
            throw PortalException.SMS_AUTH_CODE_NOT_FOUND;
        }
        String[] split = value.split("&");
        if (split.length != 4) {
            throw PortalException.SMS_AUTH_CODE_NOT_FOUND;
        }
        if (!Objects.equals(phoneNumber,split[0])) {
            throw PortalException.SMS_AUTH_PHONE_NUMBER_ERROR;
        }
        if (!Objects.equals(bizType, split[1]) || Objects.equals(authCode,split[2])) {
            throw PortalException.SMS_AUTH_CODE_ERROR;
        }
        long current = System.currentTimeMillis();
        long sendTime = Long.parseLong(split[3]);
        if ((current - sendTime) > MINUTES.toMillis(authCodeEffectiveMinute)) {
            throw PortalException.SMS_AUTH_CODE_EXPIRED;
        }
    }

    /**
     * 生成验证码
     * @return
     */
    private String generateAuthCode() {
        return RandomUtil.randomNumbers(codeLength);
    }

    /**
     * 获取当前用户的手机号
     * @return
     */
    private String getPrincipalPhoneNumber() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        if (principal instanceof User) {
            return ((User) principal).getPhoneNumber();
        }
        throw PortalException.PRINCIPAL_PHONE_NUMBER_NOT_FOUND;
    }

    private void validateParam(String phoneNumber, String bizType) {
        if (!Validator.isMobile(phoneNumber)) {
            throw BizException.PARAMETER_VALIDATE_EXCEPTION.newInstance("手机号格式错误");
        }

        if (!BIZ_TYPE_SET.contains(bizType)) {
            throw BizException.PARAMETER_VALIDATE_EXCEPTION.newInstance("短信验证码业务业务类型错误");
        }
    }

    public String getTempCode() {
        return tempCode;
    }

    public void setTempCode(String tempCode) {
        this.tempCode = tempCode;
    }

    public int getAuthCodeEffectiveMinute() {
        return authCodeEffectiveMinute;
    }

    public void setAuthCodeEffectiveMinute(int authCodeEffectiveMinute) {
        this.authCodeEffectiveMinute = authCodeEffectiveMinute;
    }

    public byte getCodeLength() {
        return codeLength;
    }

    public void setCodeLength(byte codeLength) {
        this.codeLength = codeLength;
    }
}
