package com.xworkz.general.dto;

public class MarriageDTO {
    private String groomName;
    private String brideName;
    private String location;
    private String address;
    private String religion;
    private String date;
    private String witness1;
    private String witness2;
    private String officer;

    public MarriageDTO() {
        System.out.println("No arg cont of MarriageDTO");
    }

    public MarriageDTO(String groomName, String brideName, String location, String address,
                       String religion, String date, String witness1, String witness2, String officer) {
        this.groomName = groomName;
        this.brideName = brideName;
        this.location = location;
        this.address = address;
        this.religion = religion;
        this.date = date;
        this.witness1 = witness1;
        this.witness2 = witness2;
        this.officer = officer;
    }


    public String getGroomName() {
        return groomName;
    }

    public void setGroomName(String groomName) {
        this.groomName = groomName;
    }

    public String getBrideName() {
        return brideName;
    }

    public void setBrideName(String brideName) {
        this.brideName = brideName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWitness1() {
        return witness1;
    }

    public void setWitness1(String witness1) {
        this.witness1 = witness1;
    }

    public String getWitness2() {
        return witness2;
    }

    public void setWitness2(String witness2) {
        this.witness2 = witness2;
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }
}
