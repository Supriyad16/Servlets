package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor


public class CityDTO {

    private String cityName;
    private String state;
    private int populationInMillion;
    private String ChiefMinister;

    private InformationDTO informationDTO;

}


