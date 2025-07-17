package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor

public class HouseDTO {

    private int houseNumber;
    private String buildingName;
    private int floorCount;
    private String type;

    private DetailsDTO detailsDTO;

}
