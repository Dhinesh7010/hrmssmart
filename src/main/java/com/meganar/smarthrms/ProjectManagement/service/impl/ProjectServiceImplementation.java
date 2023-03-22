package com.meganar.smarthrms.ProjectManagement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.meganar.smarthrms.ProjectManagement.service.ProjectService;
import com.meganar.smarthrms.ProjectManagement.model.Project;
import com.meganar.smarthrms.ProjectManagement.repository.ProjectRepository;

@Service
public class ProjectServiceImplementation implements ProjectService {

    private ProjectRepository projectrepository;
	
	public ProjectServiceImplementation(ProjectRepository projectrepository) {
		super();
		this.projectrepository = projectrepository;
	}

	@Override
	public List<Project> getAllProjects() {
		return projectrepository.findAll();
	}

	@Override
	public Project saveProject(Project project){
		return projectrepository.save(project);
	}

	@Override
	public Project getProjectById(Long id){
		return projectrepository.findById(id).get();
	}

}
