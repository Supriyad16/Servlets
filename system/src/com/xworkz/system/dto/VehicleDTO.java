package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor

public class VehicleDTO {

    private int vehicleNumber;
    private String model;
    private String manufacturer;
    private String fuelType;

    private RegistrationDTO registrationDTO;

}
