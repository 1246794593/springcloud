package com.springcloud.cilent.service;

import com.springcloud.cilent.dao.TestMapper;
import com.springcloud.cilent.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImp implements TestService{
    @Autowired
    TestMapper testMapper;
    @Override
    public String test() {
        List<Test> result=testMapper.select();
        return result.toString();
    }
}
