package org.kxw.springcloud.hystrix.controller;

import org.kxw.springcloud.hystrix.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Create by kangxiongwei on 2018/7/5 22:17.
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
