package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor


public class WardDTO {

    private int wardNumber;
    private String wardName;
    private String councillorName;
    private float populationInLakhs;

}
