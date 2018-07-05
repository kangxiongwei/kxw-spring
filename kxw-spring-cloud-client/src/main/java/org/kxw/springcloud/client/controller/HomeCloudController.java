package org.kxw.springcloud.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by kangxiongwei on 2018/7/5 19:15.
 */
@RestController
@RequestMapping("/home")
public class HomeCloudController {

    @RequestMapping("/cloud")
    public String home(@RequestParam String name) {
        return "Hello " + name;
    }

}
