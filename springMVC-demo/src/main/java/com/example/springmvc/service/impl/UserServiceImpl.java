package com.example.springmvc.service.impl;

import com.example.springmvc.dao.UserInfoMapper;
import com.example.springmvc.model.entity.UserInfo;
import com.example.springmvc.model.entity.UserInfoExample;
import com.example.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> selectUserList() {
        UserInfoExample userInfoExample = new UserInfoExample();
        return userInfoMapper.selectByExample(userInfoExample);
    }

    @Override
    public String addUser(String username, String password) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUsernameEqualTo(username);
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(userInfoExample);
        if (null == userInfoList || userInfoList.isEmpty()) {
            UserInfo userInfo = new UserInfo();
            userInfo.setUsername(username);
            userInfo.setPassword(password);
            userInfoMapper.insertSelective(userInfo);
            return "添加成功";
        }
        return "用户名已使用";
    }

    @Override
    public UserInfo searchUser(String username) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUsernameEqualTo(username);
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(userInfoExample);
        return userInfoList.get(0);
    }
}
