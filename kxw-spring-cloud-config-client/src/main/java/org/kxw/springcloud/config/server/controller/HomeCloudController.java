package org.kxw.springcloud.config.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by kangxiongwei on 2018/7/5 19:15.
 */
@RestController
public class HomeCloudController {

    @Value("${foo}")
    private String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "Hello " + name + ", I am foo " + port;
    }

}
