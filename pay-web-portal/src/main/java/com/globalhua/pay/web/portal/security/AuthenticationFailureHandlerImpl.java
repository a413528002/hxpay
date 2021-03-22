package com.globalhua.pay.web.portal.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.globalhua.pay.common.web.vo.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthenticationFailureHandlerImpl implements AuthenticationFailureHandler {

    public static final Logger log = LoggerFactory.getLogger(AuthenticationFailureHandlerImpl.class);

    @Resource
    private ObjectMapper objectMapper;

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        if (log.isDebugEnabled()) {
            log.debug("认证失败: {}",exception.getMessage());
        }
        response.setContentType("application/json;charset=utf-8");
        response.setStatus(401);
        CommonResult<Void> result = CommonResult.error(-1, exception.getMessage());
        String json = objectMapper.writeValueAsString(result);
        response.getWriter().print(json);
        response.flushBuffer();
    }
}
