package com.globalhua.pay.web.portal.dto;

/**
 * 获取短信验证码请求对象
 */
public class GetSmsAuthCodeRequest {

    /**
     * 手机号
     */
    String phoneNumber;

    /**
     * 业务类型
     */
    String bizType;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }
}
