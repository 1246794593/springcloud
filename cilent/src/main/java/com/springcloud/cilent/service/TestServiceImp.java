package com.springcloud.cilent.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImp implements TestService{

    @Override
    public String test() {
        System.out.println("test");
        return "test";
    }
}
