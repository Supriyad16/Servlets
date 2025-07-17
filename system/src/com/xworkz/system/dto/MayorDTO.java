package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor


public class MayorDTO {

    private String name;
    private int age;
    private String city;
    private int termDuration;

    private VehicleDTO vehicleDTO;

}
