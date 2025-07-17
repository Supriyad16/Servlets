package com.xworkz.system.dto;

import lombok.*;



@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor


public class ConstituencyDTO {


    private String constituencyName;
    private int constituencyNumber;
    private String mpName;
    private String state;

    private WardDTO wardDTO;

}
