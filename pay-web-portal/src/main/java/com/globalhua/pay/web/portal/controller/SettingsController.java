package com.globalhua.pay.web.portal.controller;

import com.globalhua.pay.web.portal.bo.ResetPasswordBo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 个人设置
 */
@RestController
public class SettingsController {

    /**
     * 修改密码
     */
    @PostMapping("resetPassword")
    public void resetPassword(@RequestBody ResetPasswordBo body) {

    }

    /**
     * 修改支付密码
     */
    @PostMapping("resetPayPassword")
    public void resetPayPassword() {

    }
}
