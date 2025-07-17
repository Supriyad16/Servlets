package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor

public class PresidentDTO {

    private String name;
    private int age;
    private int term;
    private String country;

    private DesignationDTO designationDTO;

}
