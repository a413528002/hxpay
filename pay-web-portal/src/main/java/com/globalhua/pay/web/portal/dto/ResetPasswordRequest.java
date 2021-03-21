package com.globalhua.pay.web.portal.dto;

/**
 * 重置密码请求对象
 */
public class ResetPasswordRequest {

    /**
     * 密码
     */
    String password;

    /**
     * 验证码
     */
    String authCode;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
}
