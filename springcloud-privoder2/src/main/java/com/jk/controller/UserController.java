package com.jk.controller;

import com.jk.model.UserBean;
import com.jk.service.DemoService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements DemoService {
    @Override
    public List<UserBean> querylist() {
        return null;
    }

    @Override
    public String test() {
        return "haha";
    }
}
