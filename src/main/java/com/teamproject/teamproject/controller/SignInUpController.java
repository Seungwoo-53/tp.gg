package com.teamproject.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInUpController {

    @GetMapping("/login")
    public String Login(){
        return "/login";
    }

    @GetMapping("/signup")
    public String SignUp(){
        return "/signup";
    }
}
