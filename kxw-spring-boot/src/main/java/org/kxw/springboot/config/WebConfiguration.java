package org.kxw.springboot.config;

import org.kxw.springboot.filter.AuthFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create by kangxiongwei on 2018/7/4 上午8:12
 */
@Configuration
public class WebConfiguration {

    @Bean
    public FilterRegistrationBean authFilter() {
        FilterRegistrationBean<AuthFilter> registration = new FilterRegistrationBean();
        registration.setFilter(new AuthFilter());
        registration.addUrlPatterns("/auth/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("authFilter");
        registration.setOrder(1);
        return registration;
    }




}
