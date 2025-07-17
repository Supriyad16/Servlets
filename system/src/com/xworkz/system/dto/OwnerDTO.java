package com.xworkz.system.dto;

import lombok.*;

import java.util.List;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor

public class OwnerDTO {

    private String name;
    private int age;
    private String gender;
    private long contactNumber;

    private List<HouseDTO> houseDTO;

}
