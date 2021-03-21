//package com.globalhua.pay.web.portal.security.sms;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.AuthenticationServiceException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//import org.springframework.security.web.util.matcher.RequestMatcher;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * 短信认证过滤器
// */
//public class SmsAuthenticationFilter extends AbstractAuthenticationProcessingFilter {
//
//    private static final AntPathRequestMatcher DEFAULT_ANT_PATH_REQUEST_MATCHER = new AntPathRequestMatcher("/smsLogin",
//            "POST");
//
//    private ObjectMapper objectMapper;
//
//    public SmsAuthenticationFilter() {
//        super(DEFAULT_ANT_PATH_REQUEST_MATCHER);
//    }
//
//    public SmsAuthenticationFilter(AuthenticationManager authenticationManager) {
//        super(DEFAULT_ANT_PATH_REQUEST_MATCHER, authenticationManager);
//    }
//
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
//        if (!request.getMethod().equals("POST")) {
//            throw new AuthenticationServiceException("Authentication method not supported: " + request.getMethod());
//        }
//
//        String ticket = request.getParameter("ticket");
//        if (ticket == null || ticket.isEmpty()) {
//            throw new AuthenticationServiceException("Missing ticket");
//        }
//
//
//
//        String username = obtainUsername(request);
//        username = (username != null) ? username : "";
//        username = username.trim();
//        String password = obtainPassword(request);
//        password = (password != null) ? password : "";
//        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(username, password);
//        // Allow subclasses to set the "details" property
//        setDetails(request, authRequest);
//        return this.getAuthenticationManager().authenticate(authRequest);
//    }
//}
