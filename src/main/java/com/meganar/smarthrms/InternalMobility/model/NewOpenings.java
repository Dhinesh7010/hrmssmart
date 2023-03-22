package com.meganar.smarthrms.InternalMobility.model;

import jakarta.persistence.*;

@Entity
@Table(name = "newopening")
public class NewOpenings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "job_title")
    private String jobTitle;
    @Column(name = "job_description")
    private String jobDescription;
    @Column(name = "qualification")
    private String qualification;
    @Column(name = "skill_set")
    private String skillSet;
    @Column(name = "opening")
    private String opening;
    @Column(name = "location")
    private String location;
    @Column(name = "department")
    private String department;
    @Column(name = "shift")
    private String shift;
    @Column(name = "certification")
    private String certification;
    @Column(name = "resume")
    private String resume;


    public NewOpenings() {
    }

    public NewOpenings(String jobTitle, String jobDescription, String qualification, String skillSet, String opening, String location, String department, String shift, String certification, String resume) {
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.qualification = qualification;
        this.skillSet = skillSet;
        this.opening = opening;
        this.location = location;
        this.department = department;
        this.shift = shift;
        this.certification = certification;
        this.resume = resume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    public String getOpening() {
        return opening;
    }

    public void setOpening(String opening) {
        this.opening = opening;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "NewOpenings{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", qualification='" + qualification + '\'' +
                ", skillSet='" + skillSet + '\'' +
                ", opening='" + opening + '\'' +
                ", location='" + location + '\'' +
                ", department='" + department + '\'' +
                ", shift='" + shift + '\'' +
                ", certification='" + certification + '\'' +
                ", resume='" + resume + '\'' +
                '}';
    }
}
