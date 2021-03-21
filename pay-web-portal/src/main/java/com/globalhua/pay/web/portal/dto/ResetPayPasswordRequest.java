package com.globalhua.pay.web.portal.dto;

/**
 * 重置支付密码请求对象
 */
public class ResetPayPasswordRequest {

    /**
     * 支付密码
     */
    String payPassword;

    /**
     * 验证码
     */
    String authCode;

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
}
