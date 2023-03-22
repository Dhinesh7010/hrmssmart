package com.meganar.smarthrms.ProjectManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meganar.smarthrms.ProjectManagement.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    
}
