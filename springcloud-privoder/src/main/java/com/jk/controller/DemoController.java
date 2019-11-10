package com.jk.controller;

import com.jk.model.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class DemoController {
    @Autowired
    private UserService userService;



    @GetMapping("test")
    @ResponseBody
    public String test(){
        return userService.test();
    }
    @GetMapping()
    @ResponseBody
    public List<UserBean> querylist(){
        return userService.querylist();
    }
}
