package com.taotao.service.impl;

import com.taotao.mapper.TestMapper;
import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 测试，查询当前系统时间
 * Created by Jiang on 2018-08-15.
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public String queryNow() {
        //1.注入mapper
        //2.调用mapper方法
        return testMapper.queryNow();
    }
}
