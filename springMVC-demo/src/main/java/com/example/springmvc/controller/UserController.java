package com.example.springmvc.controller;

import com.example.springmvc.model.entity.UserInfo;
import com.example.springmvc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/test_db")
    public String testDB(){
        UserInfo userInfo = helloService.helloDb();
        System.out.println(userInfo.getUsername());
        return "hi";
    }
}
