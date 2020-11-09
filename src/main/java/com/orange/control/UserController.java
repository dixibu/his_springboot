package com.orange.control;

import com.orange.javaBean.User;
import com.orange.service.UserService;
import com.orange.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class UserController {
    @Autowired

    private UserServiceImpl userService;
    @RequestMapping("/userlogin")
    @ResponseBody
    public User login(@RequestBody Map<String,Object> map){
        System.out.println(map+"----------------------");
        String s1=(String)(map.get("username"));
        String s2=(String)(map.get("password"));
        System.out.println(s1+",,,,,,"+s2);
       User user =  userService.login(s1,s2);
       if(user!=null){
           System.out.println(user.getUsername());
           return user;
       }else{
           System.out.println("没有账号");
           return null;
       }

    }

}
