package com.jk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@RestController
public class TestController {
    @Value("{test.aa}")
    private  String aa;
    @Value("${server.port}")
    private  String b;

    @RequestMapping("test")
    public String test(){
        return aa+"==="+b;
    }

}
