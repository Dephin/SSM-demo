package com.example.springmvc.service.impl;

import com.example.springmvc.dao.UserInfoMapper;
import com.example.springmvc.model.entity.UserInfo;
import com.example.springmvc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo helloDb() {
        return userInfoMapper.selectByPrimaryKey(1);
    }

}
