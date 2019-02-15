package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

    @RequestMapping("ajax")
    public String ajax(){
        return "ajax";
    }

    @RequestMapping("test_ajax")
    @ResponseBody
    public String testAjax(){
        return "成功";
    }
}
