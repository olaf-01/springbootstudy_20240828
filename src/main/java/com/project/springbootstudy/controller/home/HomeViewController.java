package com.project.springbootstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeViewController {
    @GetMapping("/") //메인사이트 (localhost:8087)
    public String gologin(){
        return "/user/login";
    }

    @GetMapping("/home")
    public String home(){
        return "/home";
    }
}
