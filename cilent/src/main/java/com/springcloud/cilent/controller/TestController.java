package com.springcloud.cilent.controller;

import com.springcloud.cilent.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/test")
    public void testApi(){
        testService.test();
    }
}
