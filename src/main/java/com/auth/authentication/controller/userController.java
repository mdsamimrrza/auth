package com.auth.authentication.controller;

import com.auth.authentication.model.Users;
import com.auth.authentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        System.out.println("register "+ user);
        return userService.register(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody Users user){
        System.out.println("login sucess "+user);
        return userService.verify(user);
    }
}
