package com.auth.authentication.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/")
    public String hello(HttpServletRequest request){
        return " welcome users  " + request.getSession().getId();
    }
    @GetMapping("/Hello")
    public String Greet(){
        return " hello my Freind";
    }


}
