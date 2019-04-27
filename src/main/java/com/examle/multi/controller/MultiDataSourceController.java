package com.examle.multi.controller;

import com.examle.multi.entity.User;
import com.examle.multi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiDataSourceController {
    @Autowired
    private UserService userService;

    @GetMapping("/test1")
    public User test1(){
        return userService.add1();
    }

    @GetMapping("/test2")
    public User test2(){
        return userService.add2();
    }
}
