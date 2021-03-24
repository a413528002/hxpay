package com.globalhua.pay.web.portal.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.globalhua.pay.common.web.vo.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.session.SessionInformationExpiredEvent;
import org.springframework.security.web.session.SessionInformationExpiredStrategy;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UnauthorizedSessionInformationExpiredStrategy implements SessionInformationExpiredStrategy {

    public static final Logger log = LoggerFactory.getLogger(UnauthorizedSessionInformationExpiredStrategy.class);

    @Resource
    private ObjectMapper objectMapper;

    @Override
    public void onExpiredSessionDetected(SessionInformationExpiredEvent event) throws IOException, ServletException {
        if (log.isDebugEnabled()) {
            event.getSessionInformation().getPrincipal();
            log.debug("会话过期，principal：{}",event.getSessionInformation().getPrincipal());
        }
        HttpServletResponse response = event.getResponse();
        response.setContentType("application/json;charset=utf-8");
        response.setStatus(401);
        CommonResult<Void> result = CommonResult.error("会话已过期");
        String json = objectMapper.writeValueAsString(result);
        response.getWriter().print(json);
        response.flushBuffer();
    }
}
