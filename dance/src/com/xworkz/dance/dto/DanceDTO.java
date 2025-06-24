package com.xworkz.dance.dto;

import java.io.Serializable;

public class DanceDTO implements Serializable {

    private String name;
    private int age;
    private String gender;
    private String style;
    private String experience;
    private Boolean availability;
    private Long phone;
    private String address;

    DanceDTO(){
        System.out.println("No-arg const of DTO");
    }

    public DanceDTO(String name, int age, String gender, String style, String experience, Boolean availability, Long phone, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.style = style;
        this.experience = experience;
        this.availability = availability;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int pk) {

    }
}
