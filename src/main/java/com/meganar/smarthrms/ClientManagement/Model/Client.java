package com.meganar.smarthrms.Model;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Client {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "clientid")
    private long id;

    private String name;

    private String Address;

    private String phone;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Project> project;

    @Lob
    @Column(name = "profileimage", length=100000)
    private byte[] imageData;

    private String base64Image;

    private int gsi;

    private int cin;

    private String clientManager;

    public void addProjects(List<Project> list){
        this.project.addAll(list);
    }

    public void setImageData(MultipartFile file) throws IOException{
        this.imageData=file.getBytes();
    }

}
