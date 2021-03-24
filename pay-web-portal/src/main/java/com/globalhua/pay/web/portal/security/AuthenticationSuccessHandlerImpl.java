package com.globalhua.pay.web.portal.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.globalhua.pay.common.web.vo.CommonResult;
import com.globalhua.pay.web.portal.biz.MaskBiz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {

    public static final Logger log = LoggerFactory.getLogger(AuthenticationSuccessHandlerImpl.class);

    @Resource
    ObjectMapper objectMapper;

    @Resource
    MaskBiz maskBiz;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        if (log.isDebugEnabled()) {
            log.debug("认证成功，principal：{}",authentication.getPrincipal());
        }

        // 返回结果
        CommonResult<User> result = getResult(authentication);

        response.setContentType("application/json;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        String json = objectMapper.writeValueAsString(result);
        response.getWriter().print(json);
        response.flushBuffer();
    }

    private CommonResult<User> getResult(Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        User vo = user.clone();
        maskBiz.maskUser(vo);
        CommonResult<User> result = CommonResult.ok(vo);
        return result;
    }
}
