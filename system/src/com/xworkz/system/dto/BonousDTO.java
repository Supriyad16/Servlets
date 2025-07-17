package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor


public class BonousDTO {
    private String bonusType;
    private double amount;
    private String givenBy;
    private String occasion;

    private VariablePayDTO variablePayDTO;


}
