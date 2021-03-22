package com.globalhua.pay.web.portal.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.globalhua.pay.common.web.vo.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {

    public static final Logger log = LoggerFactory.getLogger(AuthenticationSuccessHandlerImpl.class);

    @Resource
    private ObjectMapper objectMapper;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        if (log.isDebugEnabled()) {
            log.debug("认证成功: {}",authentication);
        }
        response.setContentType("application/json;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        User user = (User) authentication.getPrincipal();
        CommonResult<User> result = CommonResult.ok(user.maskClone());
        OutputStream out = response.getOutputStream();
        objectMapper.writeValue(out, result);
        out.flush();
        out.close();
    }
}
