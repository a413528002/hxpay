package com.globalhua.pay.web.portal.config;

import com.globalhua.pay.web.portal.constants.PortalConstants;
import com.globalhua.pay.web.portal.security.*;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.session.SessionInformationExpiredStrategy;
import org.springframework.security.web.util.matcher.AnyRequestMatcher;

//@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/signInAuth/**").authenticated()
                // 所有请求需要手机短信认证的权限
                .anyRequest().hasAuthority(PortalConstants.AUTHORITY_SMS_CODE_AUTHENTICATION)
                .and()
                .cors()
                .and()
                .csrf()
                .and()
                .formLogin()
                .successHandler(authenticationSuccessHandler())
                .failureHandler(authenticationFailureHandler())
                .and()
                .logout()
                .logoutSuccessHandler(logoutSuccessHandler())
                .and()
                .exceptionHandling()
                .defaultAuthenticationEntryPointFor(authenticationEntryPoint(), AnyRequestMatcher.INSTANCE)
                .and()
                .sessionManagement()
                .maximumSessions(1)
               // .sessionRegistry()
                .expiredSessionStrategy(sessionInformationExpiredStrategy())
                .and()
                .sessionAuthenticationFailureHandler(authenticationFailureHandler());
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsServiceImpl();
    }

    @Bean
    public AuthenticationSuccessHandler authenticationSuccessHandler() {
        return new AuthenticationSuccessHandlerImpl();
    }

    @Bean
    public AuthenticationFailureHandler authenticationFailureHandler() {
        return new AuthenticationFailureHandlerImpl();
    }

    @Bean
    public SessionInformationExpiredStrategy sessionInformationExpiredStrategy() {
        return new UnauthorizedSessionInformationExpiredStrategy();
    }

    @Bean
    public LogoutSuccessHandler logoutSuccessHandler() {
        return new HttpStatusReturningLogoutSuccessHandler();
    }

    @Bean
    public AuthenticationEntryPoint authenticationEntryPoint() {
        return new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED);
    }

  /*  @Bean
    public SpringSessionBackedSessionRegistry<S> sessionRegistry() {
        return new SpringSessionBackedSessionRegistry<>(this.sessionRepository);
    }*/

    @Bean
    public AuthenticationProvider authenticationProvider() {
        AuthenticationProviderImpl authenticationProvider = new AuthenticationProviderImpl();
        authenticationProvider.setUserDetailsService(userDetailsService());
        return authenticationProvider;
    }

}
