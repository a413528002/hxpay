package com.globalhua.pay.web.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "com.globalhua.pay.core.*.biz",
        "com.globalhua.pay.facade.*.service.impl"})
@MapperScan("com.globalhua.pay.core.*.mapper")
public class RootConfig {

}
