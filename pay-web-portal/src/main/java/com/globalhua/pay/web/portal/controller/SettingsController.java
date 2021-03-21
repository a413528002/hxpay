package com.globalhua.pay.web.portal.controller;

import com.globalhua.pay.common.web.vo.CommonResult;
import com.globalhua.pay.facade.account.service.AccountManagementFacade;
import com.globalhua.pay.web.portal.biz.SmsAuthCodeBiz;
import com.globalhua.pay.web.portal.dto.ResetPasswordRequest;
import com.globalhua.pay.web.portal.dto.ResetPayPasswordRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 个人设置
 */
@RestController
public class SettingsController {

    @Resource
    AccountManagementFacade accountManagementFacade;

    @Resource
    SmsAuthCodeBiz smsAuthCodeBiz;

    /**
     * 修改密码
     */
    @PostMapping("resetPassword")
    public CommonResult<Void> resetPassword(@RequestBody ResetPasswordRequest body) {
//        smsAuthCodeBiz.checkAuthCode(,SmsAuthCodeBiz.BIZ_TYPE_RESET_PASSWORD,body.getAuthCode());
//        accountManagementFacade.resetPassword(,body.getPassword());
        return CommonResult.ok();
    }

    /**
     * 修改支付密码
     */
    @PostMapping("resetPayPassword")
    public CommonResult<Void> resetPayPassword(@RequestBody ResetPayPasswordRequest body) {
//        smsAuthCodeBiz.checkAuthCode(,SmsAuthCodeBiz.BIZ_TYPE_RESET_PAY_PASSWORD,body.getAuthCode());
//        accountManagementFacade.resetPayPassword(,body.getPayPassword());
        return CommonResult.ok();
    }
}
