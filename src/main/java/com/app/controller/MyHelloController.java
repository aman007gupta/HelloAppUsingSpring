package com.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MyHelloController {

    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From Aman!!";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}