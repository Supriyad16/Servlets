package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor

public class SalaryExpectationDTO {

    private double expectedCTC;
    private String currency;
    private String jobLevel;
    private boolean negotiable;

    private BonousDTO bonousDTO;

}
