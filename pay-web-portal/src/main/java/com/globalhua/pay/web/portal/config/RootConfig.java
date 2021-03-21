package com.globalhua.pay.web.portal.config;

import com.globalhua.pay.facade.account.service.AccountManagementFacade;
import com.globalhua.pay.facade.account.service.impl.AccountManagementFacadeImpl;
import com.globalhua.pay.facade.service.impl.TollManagementFacadeImpl;
import com.globalhua.pay.facade.toll.service.TollManagementFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfig {

    @Bean
    public AccountManagementFacade accountManagementFacade() {
        return new AccountManagementFacadeImpl();
    }

    @Bean
    public TollManagementFacade tollManagementFacade() {
        return new TollManagementFacadeImpl();
    }
}
