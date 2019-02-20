package com.example.springmvc.controller;

import com.example.springmvc.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("ajax")
public class AjaxController {

    @RequestMapping("")
    public String ajax(){
        return "ajax";
    }

    @RequestMapping("test1")
    @ResponseBody
    public String testAjax(){
        return "成功";
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String searchWordByFormData(String word){
        System.out.println(word);
        return "yes";
    }

    @RequestMapping("/test3")
    @ResponseBody
    public String searchWordByJson(@RequestBody String json){
        System.out.println(json);
        return "yes";
    }

}
