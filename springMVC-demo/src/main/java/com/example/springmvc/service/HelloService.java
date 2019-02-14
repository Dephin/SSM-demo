package com.example.springmvc.service;

import com.example.springmvc.dao.UserInfoMapper;
import com.example.springmvc.model.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;

public interface HelloService {
    UserInfo helloDb();
}
