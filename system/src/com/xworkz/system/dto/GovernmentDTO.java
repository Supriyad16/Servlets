package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor

public class GovernmentDTO {

    private String type;
    private String country;
    private int establishedYear;
    private String headOfState;

    private PrimeMinisterDTO primeMinisterDTO;

}
