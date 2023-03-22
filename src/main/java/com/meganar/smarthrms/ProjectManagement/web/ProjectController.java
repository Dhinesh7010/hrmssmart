package com.meganar.smarthrms.ProjectManagement.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meganar.smarthrms.ProjectManagement.model.Project;
import com.meganar.smarthrms.ProjectManagement.service.ProjectService;


@Controller
@RequestMapping("/projects")
public class ProjectController {

    private ProjectService projectservice;

	public ProjectController(ProjectService projectservice) {
		super();
		this.projectservice = projectservice;
	}

    @GetMapping("/")
    public String listingProjects(Model model){
        model.addAttribute("project", projectservice.getAllProjects());
        return "ProjectManagement/Projects";
    }

    @GetMapping("/{id}")
    public String confirmProject(@PathVariable Long id, Model model){
        model.addAttribute("project", projectservice.getProjectById(id));
        return "ProjectManagement/EditProject";
    }

    @PostMapping("/{id}")
    public String completeProject(@PathVariable Long id, @ModelAttribute("project") Project project){
        Project existingProject = projectservice.getProjectById(id);
        existingProject.setStatus(true);
        projectservice.saveProject(existingProject);
        return "redirect:/projects/";
    }

    @GetMapping("/new")
    public String creatingProjects(Model model){
        Project project = new Project();
        model.addAttribute("project", project);
        return "ProjectManagement/AddProject";
    }

    @PostMapping("/new")
    public String savingProjects(@ModelAttribute("project") Project project){
        projectservice.saveProject(project);
        return "redirect:/projects/";
    }

}
