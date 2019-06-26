package com.springcloud.servicefeign.controller;

import com.springcloud.servicefeign.clientInterface.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @GetMapping(value = "/hello")
    public String hello(@RequestParam(value = "name")String name){
        return schedualServiceHi.hello(name);
    }
}
