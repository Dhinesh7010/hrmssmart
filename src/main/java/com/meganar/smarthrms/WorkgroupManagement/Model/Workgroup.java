package com.meganar.smarthrms.WorkgroupManagement.Model;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.Getter;

@Getter @Setter @NoArgsConstructor
@Entity(name="workgroup")
public class Workgroup {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="workgroupid")
    private long workgroupid;


}
