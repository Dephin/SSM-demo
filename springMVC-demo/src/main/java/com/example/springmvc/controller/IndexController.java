package com.example.springmvc.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @RequestMapping("/test")
    public String test(){
        return "register";
    }

    @RequestMapping("/search_user")
    public String searchUser(){
        return "register";
    }

    @RequestMapping("/search_word")
    @ResponseBody
    public String searchWord(String word, HttpServletRequest request){
        System.out.println(word);
        return "yes";
    }

    @RequestMapping("/index")
    public String index(){return "index";}

}
