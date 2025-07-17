package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor

public class VariablePayDTO {

    private double performanceBonus;
    private double incentive;
    private String frequency;
    private String applicableRole;

    private TaxDTO taxDTO;

}
