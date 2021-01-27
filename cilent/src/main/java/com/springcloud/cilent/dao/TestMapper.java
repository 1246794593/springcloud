package com.springcloud.cilent.dao;

import com.springcloud.cilent.entity.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {
    List<Test> select();
}
