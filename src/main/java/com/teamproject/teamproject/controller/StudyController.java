package com.teamproject.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudyController {

    @GetMapping("/study")
    public String getStudyController(){
        return "/study/index";
    }
}
