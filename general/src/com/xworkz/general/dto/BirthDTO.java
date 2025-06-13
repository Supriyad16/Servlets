package com.xworkz.general.dto;

import java.io.Serializable;

public class BirthDTO implements Serializable {

    private String bid;
    private String name;
    private String fname;
    private String mname;
    private String dates;
    private String times;
    private String dname;
    private String nname;

    public BirthDTO() {
        System.out.println("No arg cont of BirthDTO");
    }

    public BirthDTO(String bid, String name, String fname, String mname, String dates, String times, String dname, String nname) {
        this.bid = bid;
        this.name = name;
        this.fname = fname;
        this.mname = mname;
        this.dates = dates;
        this.times = times;
        this.dname = dname;
        this.nname = nname;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
