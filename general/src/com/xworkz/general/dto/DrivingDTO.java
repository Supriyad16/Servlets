package com.xworkz.general.dto;

public class DrivingDTO {
    private String name;
    private String address;
    private String mobile;
    private String appliedDate;
    private String vehicleType;

    public DrivingDTO() {
        System.out.println("No arg cont of DrivingDTO");
    }

    public DrivingDTO(String name, String address, String mobile, String appliedDate, String vehicleType) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.appliedDate = appliedDate;
        this.vehicleType = vehicleType;
    }


    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(String appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
