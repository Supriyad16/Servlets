package com.xworkz.loan.dto;

import java.io.Serializable;

public class LoanDTO implements Serializable {

    private String name;
    private int age;
    private String gender;
    private String phone;
    private String address;
    private String loan_type;
    private int amount;
    private int tenure;

    public LoanDTO() {
        System.out.println("No-arg Constructor of LoanDTO");
    }

    public LoanDTO(String name, int age, String gender, String phone, String address, String loan_type, int amount, int tenure) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.loan_type = loan_type;
        this.amount = amount;
        this.tenure = tenure;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLoan_type() {
        return loan_type;
    }

    public void setLoan_type(String loan_type) {
        this.loan_type = loan_type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }


    public void setId(int pk) {

    }
}
