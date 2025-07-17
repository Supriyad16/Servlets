package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor

public class DetailsDTO {

    private String ownerName;
    private String houseType;
    private int numberOfRooms;
    private boolean isRented;

    private AddressDTO addressDTO;

}
