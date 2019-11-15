package com.springboot.springboot.controller;

import com.springboot.springboot.pojo.User;
import com.springboot.springboot.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id){
        return  userRepository.findById(id).get();
    }

    @GetMapping("/user/sava")
    public User insertUser(){
        User user = new User();
        user.setEmail("lalala");
        user.setName("黄壮");
        return userRepository.save(user);
    }
}
