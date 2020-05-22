package com.example.HelloWorldApplication.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebClassController {

    @GetMapping("/nilesh")
    public String hi(@RequestParam(value = "name",defaultValue = "Nilesh Teji") String name){
        return "Hello"+" "+name+"!";
    }
    @RequestMapping("/")
    public String welcome(){
        return "Welcome to Website";
    }




}
