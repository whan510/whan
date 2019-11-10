package com.jk.service;

import com.jk.model.UserBean;

import java.util.List;

public interface UserService {
    List<UserBean> querylist();

    String test();
}
