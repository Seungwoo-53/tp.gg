package com.teamproject.teamproject.repository;

import com.teamproject.teamproject.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectsRepository extends JpaRepository<Projects, Long> {
}
