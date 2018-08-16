package com.taotao.controller;

import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 表现层测试类
 * Created by Jiang on 2018-08-15.
 */
@Controller
public class TestController {
    @Autowired
    private TestService testservice;

    @RequestMapping("/test/qureyNow")
    @ResponseBody
    public String queryNow(){
        //1.引入服务
        //2.注入服务
        //3.调用服务的方法
        return testservice.queryNow();
    }
}
