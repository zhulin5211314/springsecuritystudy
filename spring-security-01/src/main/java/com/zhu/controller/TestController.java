package com.zhu.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String mytest(){
        System.out.println("测试");
        return "环境测试！";
    }
}
