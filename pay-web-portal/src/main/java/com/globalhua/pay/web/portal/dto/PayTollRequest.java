package com.globalhua.pay.web.portal.dto;

/**
 * 支付代发请求
 */
public class PayTollRequest {
    /**
     * 代发批次ID
     */
    Long batchId;
    /**
     * 支付密码
     */
    String payPassword;
    /**
     * 短信验证码
     */
    String authCode;

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

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
