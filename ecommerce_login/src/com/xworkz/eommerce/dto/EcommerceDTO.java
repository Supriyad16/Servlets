package com.xworkz.eommerce.dto;

import java.io.Serializable;

public class EcommerceDTO implements Serializable {

    private String email;
    private String userid;
    private String password;
    private String cpassword;

    public EcommerceDTO(String email, String userid, String password) {

        System.out.println("No-arg constructor of EcommerceDTO");
    }

    public EcommerceDTO(String email, String userid, String password, String cpassword) {
        this.email = email;
        this.userid = userid;
        this.password = password;
        this.cpassword = cpassword;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }
}
