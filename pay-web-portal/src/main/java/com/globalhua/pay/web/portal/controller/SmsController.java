package com.globalhua.pay.web.portal.controller;

import com.globalhua.pay.common.web.vo.CommonResult;
import com.globalhua.pay.web.portal.biz.SmsAuthCodeBiz;
import com.globalhua.pay.web.portal.dto.GetSmsAuthCodeRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 短信验证码
 */
@RestController
@RequestMapping("sms")
public class SmsController {

    @Resource
    SmsAuthCodeBiz smsAuthCodeBiz;

    /**
     * 获取短信验证码
     */
    @PostMapping("authCode")
    public CommonResult<Void> getAuthCode(@RequestBody GetSmsAuthCodeRequest body) {
        smsAuthCodeBiz.sendSms(body.getPhoneNumber(),body.getBizType());
        return CommonResult.ok();
    }

}
