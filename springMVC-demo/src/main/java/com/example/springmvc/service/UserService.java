package com.example.springmvc.service;

import com.example.springmvc.dao.UserInfoMapper;
import com.example.springmvc.model.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {
    List<UserInfo> selectUserList();
    String addUser(String username, String password);
    UserInfo searchUser(String username);
}
