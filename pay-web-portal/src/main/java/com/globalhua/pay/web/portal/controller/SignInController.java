//package com.globalhua.pay.web.portal.controller;
//
//import cn.hutool.core.lang.Validator;
//import com.globalhua.pay.common.web.vo.CommonResult;
//import com.globalhua.pay.facade.account.service.AccountQueryFacade;
//import com.globalhua.pay.web.portal.dto.SignInRequest;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
//@RestController
//@RequestMapping("signIn")
//public class SignInController {
//
//    @Resource
//    AccountQueryFacade accountQueryFacade;
//
//    /**
//     * 查询账户，返回手机号
//     * @param body
//     * @return
//     */
//    @PostMapping("queryAccount")
//    public CommonResult<String> queryAccount(@RequestBody SignInRequest body) {
////        if (Validator.isMobile(body.getUsername())) {
////            accountQueryFacade.queryAccountByMobile(String );
////        }
//
//    }
//
//}
