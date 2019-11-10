package com.jk.service;

import com.jk.model.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@FeignClient(value = "provider2")
public interface DemoService {
    @GetMapping("user")
    List<UserBean> querylist();
    @GetMapping("user/test")
    String test();
}
