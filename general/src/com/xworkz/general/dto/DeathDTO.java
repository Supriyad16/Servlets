package com.xworkz.general.dto;

import java.io.Serializable;

public class DeathDTO implements Serializable {

    private String name;
    private String cause;
    private String date;
    private String time;
    private String age;
    private String hospitalName;
    private String manner;
    private String marks;
    private String gender;

    public DeathDTO(){
        System.out.println("No arg cont of DeathDTO");
    }

    public DeathDTO(String name, String cause, String date, String time, String age,
                    String hospitalName, String manner, String marks, String gender) {
        this.name = name;
        this.cause = cause;
        this.date = date;
        this.time = time;
        this.age = age;
        this.hospitalName = hospitalName;
        this.manner = manner;
        this.marks = marks;
        this.gender = gender;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getManner() {
        return manner;
    }

    public void setManner(String manner) {
        this.manner = manner;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
