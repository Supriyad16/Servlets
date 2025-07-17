package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor


public class RegistrationDTO {

    private int registrationNumber;
    private int registrationyear;
    private String vehicleType;
    private String ownerName;

    private RTODTO rtoDTO;

}
