package com.teamproject.teamproject.controller;

import com.teamproject.teamproject.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {
    @Autowired
    private ProjectsService projectsService;

    @GetMapping("/project")
    public String getProject(Model model){
        model.addAttribute("projects",projectsService.getAllProjcets());
        return "/project/index";
    }
    @GetMapping("/project/test")
    public String getTestProject(){
        return "/project/test";
    }
}
