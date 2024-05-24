package com.teamproject.teamproject.service;

import com.teamproject.teamproject.model.Projects;
import com.teamproject.teamproject.repository.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectsService {

    @Autowired
    private ProjectsRepository projectsRepository;

    public List<Projects> getAllProjcets(){
        return projectsRepository.findAll();
    }
}
