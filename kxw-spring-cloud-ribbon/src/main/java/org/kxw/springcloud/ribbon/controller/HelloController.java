package org.kxw.springcloud.ribbon.controller;

import org.kxw.springcloud.ribbon.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Create by kangxiongwei on 2018/7/5 19:49.
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }


}
