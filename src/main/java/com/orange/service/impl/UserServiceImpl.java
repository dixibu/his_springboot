package com.orange.service.impl;

import com.orange.javaBean.User;
import com.orange.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.orange.mapper.UserMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String username,String password) {
        User user =userMapper.userLogin(username, password);
        return user;
    }
}
