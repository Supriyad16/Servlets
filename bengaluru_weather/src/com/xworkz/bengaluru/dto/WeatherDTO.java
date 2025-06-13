package com.xworkz.bengaluru.dto;

import java.io.Serializable;

public class WeatherDTO implements Serializable {

    private String location;
    private String capture;
    private String temperature;
    private String record;


    public WeatherDTO(){
        System.out.println("No-arg const of WeatherDTO");
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCapture(String capture) {
        this.capture = capture;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setRecord(String record) {
        this.record = record;
    }



    public String getLocation() {
        return location;
    }

    public String getCapture() {
        return capture;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getRecord() {
        return record;
    }


}


