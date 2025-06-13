package com.xworkz.general.dto;

public class JobDTO {
    private String name;
    private String email;
    private String education;
    private String skills;
    private String salary;
    private String experience;

    public JobDTO() {
        System.out.println("No arg cont of JobDTO");
    }

    public JobDTO(String name, String email, String education, String skills, String salary, String experience) {
        this.name = name;
        this.email = email;
        this.education = education;
        this.skills = skills;
        this.salary = salary;
        this.experience = experience;
    }


    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
