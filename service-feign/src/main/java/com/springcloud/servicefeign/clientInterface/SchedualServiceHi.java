package com.springcloud.servicefeign.clientInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("client")
public interface SchedualServiceHi {
    @RequestMapping(value = "/client",method = RequestMethod.GET)
    String hello(@RequestParam(value = "name")String name);
}
