package com.jk.controller;

import com.jk.model.UserBean;
import com.jk.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("demo")
public class ProController {
    @Autowired
    private DemoService demoService;

   @RequestMapping("querylist")
    @ResponseBody
    public List<UserBean> querylist(){
       return demoService.querylist();
    }
    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return demoService. test();
    }


}
