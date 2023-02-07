package com.local.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/api/v1/")
public class HelloController {
    @GetMapping("/greet")
    public String greet (@RequestParam String name){
        return "Hello, "+name;
    }
    @GetMapping("/greetdummy")
    public String greetDummy (){
        return "Hello, World";
    }
}
