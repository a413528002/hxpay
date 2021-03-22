package com.globalhua.pay.web.portal.config;

import com.globalhua.pay.web.portal.constants.PortalConstants;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().hasAuthority(PortalConstants.AUTHORITY_SMS_CODE_AUTHENTICATION);
    }

}
