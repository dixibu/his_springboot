package com.orange.service;

import com.orange.javaBean.User;
import org.springframework.stereotype.Service;


public interface UserService {
     public User login(String username, String password);
}
