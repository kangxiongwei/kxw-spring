package org.kxw.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by kangxiongwei on 2018/7/4 上午8:10
 */
@RestController
public class LoginController {

    @RequestMapping(value = "/auth/login")
    public String login(String name) {
        return "Hello " + name;
    }


}
