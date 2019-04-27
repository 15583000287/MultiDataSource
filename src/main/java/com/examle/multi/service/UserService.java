package com.examle.multi.service;

import com.examle.multi.entity.User;
import com.examle.multi.repository1.UserRepository1;
import com.examle.multi.repository2.UserRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserService {
    @Autowired
    private UserRepository1 userRepository1;
    @Autowired
    private UserRepository2 userRepository2;

    public User add1(){
        User user = new User();
        user.setName("张三");
        user.setAge(new Random().nextInt(30)+20);
        return userRepository1.save(user);
    }

    public User add2(){
        User user = new User();
        user.setName("李四");
        user.setAge(new Random().nextInt(30)+20);
        return userRepository2.save(user);
    }
}
