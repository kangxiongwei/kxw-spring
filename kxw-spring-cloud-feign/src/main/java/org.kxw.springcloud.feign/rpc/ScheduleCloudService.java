package org.kxw.springcloud.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Create by kangxiongwei on 2018/7/5 21:59.
 */
@FeignClient(value = "CLOUD-CLIENT")
public interface ScheduleCloudService {

    @RequestMapping(value = "/home/cloud", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);


}
