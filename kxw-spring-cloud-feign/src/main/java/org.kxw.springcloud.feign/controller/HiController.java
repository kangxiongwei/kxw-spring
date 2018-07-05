package org.kxw.springcloud.feign.controller;

import org.kxw.springcloud.feign.rpc.ScheduleCloudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {

    @Resource
    private ScheduleCloudService scheduleCloudService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return scheduleCloudService.sayHiFromClientOne(name);
    }
}
