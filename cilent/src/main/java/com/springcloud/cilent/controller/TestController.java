package com.springcloud.cilent.controller;

import com.springcloud.cilent.service.TestService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class TestController {
    @Autowired
    TestService testService;
    @ResponseBody
    @GetMapping("selectOperation")
    public String selectOperation(){
        return testService.test();
    }
    @ResponseBody
    @PostMapping("insertOperation")
    public void insertOperation(){}
    @ResponseBody
    @GetMapping("deleteOperation")
    public void deleteOperation(){}
    @ResponseBody
    @PostMapping("updateOperation")
    public void updateOperation(){}
}
