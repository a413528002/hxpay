package com.globalhua.pay.web.portal.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.globalhua.pay.facade.account.service.impl",
        "com.globalhua.pay.facade.toll.service.impl"})
public class RootConfig {

}
