package com.jk.controller;

import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("page")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(){
        int a = 2;
        System.out.println(a);
        return "login";
    }
}
