package com.xworkz.system.dto;


import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor


public class PrimeMinisterDTO {

    private String name;
    private int age;
    private String party;
    private int termYears;

    private  ConstituencyDTO constituencyDTO;

}
