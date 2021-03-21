package com.globalhua.pay.web.portal.controller;

import com.globalhua.pay.web.portal.dto.GetSmsAuthCodeRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短信验证码
 */
@RestController
@RequestMapping("sms")
public class SmsController {

    /**
     * 获取短信验证码
     */
    @PostMapping("authCode")
    public void getAuthCode(@RequestBody GetSmsAuthCodeRequest body) {

    }

}
