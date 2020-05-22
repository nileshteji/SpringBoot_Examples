package controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebClassController {

    @GetMapping("/nilesh")
    public String hi(){
        return "Nilesh Teji";
    }
    @RequestMapping("/")
    public String welcome(){
        return "Welcome to Website";
    }




}
