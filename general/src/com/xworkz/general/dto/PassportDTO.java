package com.xworkz.general.dto;

public class PassportDTO {
    private String name;
    private String adhar;
    private String address;
    private String pno;
    private String country;
    private String state;
    private String city;
    private String pcode;
    private String passportType;
    private String pay;

    public PassportDTO() {
        System.out.println("No arg cont of PassportDTO...");
    }

    public PassportDTO(String name, String adhar, String address, String pno, String country,
                       String state, String city, String pcode, String passportType, String pay) {
        this.name = name;
        this.adhar = adhar;
        this.address = address;
        this.pno = pno;
        this.country = country;
        this.state = state;
        this.city = city;
        this.pcode = pcode;
        this.passportType = passportType;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getPassportType() {
        return passportType;
    }

    public void setPassportType(String passportType) {
        this.passportType = passportType;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdhar() {
        return adhar;
    }

    public void setAdhar(String adhar) {
        this.adhar = adhar;
    }
}
