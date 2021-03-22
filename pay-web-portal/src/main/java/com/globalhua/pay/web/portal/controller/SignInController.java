package com.globalhua.pay.web.portal.controller;

import com.globalhua.pay.common.web.vo.CommonResult;
import com.globalhua.pay.web.portal.biz.SmsAuthCodeBiz;
import com.globalhua.pay.web.portal.constants.PortalConstants;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 登入
 */
@RestController
@RequestMapping("signIn")
public class SignInController {

    @Resource
    SmsAuthCodeBiz smsAuthCodeBiz;

    /**
     * 获取短信验证码
     * @return
     */
    @PostMapping("smsCode")
    public CommonResult<String> smsCode() {
        smsAuthCodeBiz.sendSms(null,SmsAuthCodeBiz.BIZ_TYPE_SIGN_IN);
        return CommonResult.ok();
    }

    /**
     * 手机号认证
     * 通过会添加
     * {@link com.globalhua.pay.web.portal.constants.PortalConstants#AUTHORITY_SMS_CODE_AUTHENTICATION}
     * 的权限
     */
    @PostMapping("smsCodeAuth")
    public CommonResult<Void> smsCodeAuth(@RequestBody Map<String, String> body) {
        String authCode = body.get("authCode");
        smsAuthCodeBiz.checkAuthCode(null,SmsAuthCodeBiz.BIZ_TYPE_SIGN_IN, authCode);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof UsernamePasswordAuthenticationToken) {
            List<GrantedAuthority> authorities = new ArrayList<>(authentication.getAuthorities());
            if (authorities.stream().map(GrantedAuthority::getAuthority)
                    .noneMatch(PortalConstants.AUTHORITY_SMS_CODE_AUTHENTICATION::equals)) {
                authorities.add(new SimpleGrantedAuthority(PortalConstants.AUTHORITY_SMS_CODE_AUTHENTICATION));
            }
            UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(authentication.getPrincipal(),
                    authentication.getCredentials(), authorities);
            SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
        }

        return CommonResult.ok();
    }
}
