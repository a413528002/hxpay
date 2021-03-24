package com.globalhua.pay.web.portal.biz;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 短信发送业务
 */
@Component
public class SmsBiz {

    /**
     * 发送短信
     * @param phoneNumber 手机号
     * @param tempCode 模板编码
     * @param tempParam 模板参数
     */
    public void sendSms(String phoneNumber, String tempCode, Map<String, Object> tempParam) {
        // TODO: 2021/3/24
    }
}
