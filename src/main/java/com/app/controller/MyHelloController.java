package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MyHelloController {

    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From Aman!!";
    }

}