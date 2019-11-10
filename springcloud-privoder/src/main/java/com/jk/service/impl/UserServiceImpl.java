package com.jk.service.impl;

import com.jk.mapper.UserDemo;
import com.jk.model.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDemo userDemo;

    @Override
    public List<UserBean> querylist() {
        return userDemo.querylist();
    }

    @Override
    public String test() {
        return "haha";
    }
}
