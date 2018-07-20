package org.kxw.springcloud.config.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这边的@RefreshScope注解不能少，否则即使调用/refresh，配置也不会刷新
 * Create by kangxiongwei on 2018/7/5 19:15.
 */
@RestController
@RequestMapping("/home")
@RefreshScope
public class HomeCloudController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/hello")
    public String home() {
        return "Hello " + ", I am profile " + profile;
    }

}
