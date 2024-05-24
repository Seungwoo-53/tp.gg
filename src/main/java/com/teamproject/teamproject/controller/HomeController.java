package com.teamproject.teamproject.controller;

import com.teamproject.teamproject.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private ProjectsService projectsService;
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("projects",projectsService.getAllProjcets());
        return "index";
    }
}
