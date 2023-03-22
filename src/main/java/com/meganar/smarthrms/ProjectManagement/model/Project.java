package com.meganar.smarthrms.ProjectManagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity(name="project")
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "projectid")
    private long projectid;

    @Column(name = "projectname")
    private String projectname;

    @Column(name = "description")
    private String description;

    @Column(name = "manager")
    private String projectManager;

    @Column(name = "status", columnDefinition = "boolean default false")
    private Boolean status;

    //@ManyToOne
    //private Client client;

}
