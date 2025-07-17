package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor


public class AddressDTO {

    private String street;
    private String area;
    private String city;
    private int pincode;

   private CityDTO cityDTO;

}
