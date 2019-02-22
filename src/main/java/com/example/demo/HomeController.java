package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/form")
    public String getForm(){
        return "form";
    }

    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("/index1")
    public String getIndex1(){
        return "index1";
    }

    @GetMapping("/intellij")
    public String getIntellij(){
        return "intellij";
    }

    @RequestMapping("/registration")
    public String registration(){
        return "registration";
    }

    @GetMapping("/signin")
    public String getSignIn(){
        return "signin";
    }
}
