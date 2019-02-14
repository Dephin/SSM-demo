package com.example.springmvc.controller;

import com.example.springmvc.model.entity.UserInfo;
import com.example.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("user")
    public String user(){
        return "user";
    }

    @RequestMapping("/show_users")
    public String showUsers(Model model){
        List<UserInfo> userInfoList = userService.selectUserList();
        model.addAttribute("userList", userInfoList);
        return "user";
    }

    @RequestMapping("/add_user")
    public String addUser(Model model, String username, String password){
        String addResult = userService.addUser(username, password);
        model.addAttribute("addResult", addResult);
        return "user";
    }

    @RequestMapping("/search_user")
    public String searchUser(Model model, String username){
        UserInfo userInfo = userService.searchUser(username);
        model.addAttribute("searchResult", userInfo);
        return "user";
    }


}
