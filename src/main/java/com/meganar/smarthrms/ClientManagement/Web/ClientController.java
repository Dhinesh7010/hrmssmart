package com.meganar.smarthrms.ClientManagement.Web;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.PathVariable;

import com.meganar.smarthrms.ClientManagement.Model.Client;
import com.meganar.smarthrms.ProjectManagement.model.Project;
import com.meganar.smarthrms.ClientManagement.Service.ClientService;
import com.meganar.smarthrms.ProjectManagement.service.ProjectService;

@Controller
@RequestMapping("/clients")
public class ClientController {

    private ClientService clientService;
    private ProjectService projectService;

    public ClientController(ClientService clientService,
     ProjectService projectService){
        super();
        this.clientService = clientService;
        this.projectService = projectService;
    }
    
    @GetMapping("/")
    public String listingClients(Model model){
        List<Client> clients = clientService.getAllClients();
        for (Client client : clients) {
            byte[] imageData = client.getImageData();
            String base64Image = Base64.getEncoder().encodeToString(imageData);
            client.setBase64Image(base64Image);
        }
        model.addAttribute("client", clients);
        return "ClientManagement/Clients";
    }

    @GetMapping("/new")
    public String creatingClient(Model model){
        Client client = new Client();
        List<Project> project = projectService.getAllProjects();
        model.addAttribute("client", client);
        model.addAttribute("project", project);
        return "ClientManagement/AddClient";
    }

    @PostMapping("/new")
    public String savingClient(@ModelAttribute("client") Client client, @ModelAttribute("project") Project project){
        clientService.saveClient(client);
        Project existingproject = projectService.getProjectById(project.getProjectid());
        existingproject.setClient(client);
        projectService.saveProject(existingproject);
        return "redirect:/clients/";
    }

    @GetMapping("/edit/{id}")
    public String addingProject(@PathVariable Long id, Model model){
        List<Project> project = projectService.getAllProjects();
        model.addAttribute("client", clientService.getClientById(id));
        model.addAttribute("project", project);
        return "ClientManagement/EditClient";
    }

    @PostMapping("/edit/{id}")
    public String addedProject(@PathVariable Long id, @ModelAttribute("client") Client client, @ModelAttribute("project") Project project){
        Client existingClient = clientService.getClientById(id);
        existingClient.addProjects(client.getProject());
        clientService.saveClient(existingClient);
        Project existingproject = projectService.getProjectById(project.getProjectid());
        existingproject.setClient(client);
        projectService.saveProject(existingproject);
        return "redirect:/clients/";
    }

}
