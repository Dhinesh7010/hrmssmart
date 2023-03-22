package com.meganar.smarthrms.ProjectManagement.service;

import java.util.List;

import com.meganar.smarthrms.ProjectManagement.model.Project;

public interface ProjectService {
    List<Project> getAllProjects();
    Project saveProject(Project project);
    Project getProjectById(Long id);
}
