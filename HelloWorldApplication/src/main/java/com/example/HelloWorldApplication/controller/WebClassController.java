package com.example.HelloWorldApplication.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebClassController {

    @GetMapping("/")
    public String hi(@RequestParam(value = "name",defaultValue = "Nilesh Teji") String name){
        return "HelloWorld.html";
    }


    @GetMapping("/testing")
    @ResponseBody
    public String testing(){
        return "testing";
    }


    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", defaultValue="World") String name, Model model) {
            model.addAttribute("name",name);
            return "greeting";
        }

    }





