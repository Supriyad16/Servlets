package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor

public class CriteriaDTO {

    private String qualification;
    private int minExperience;
    private String skillSet;
    private String employmentType;

    private SalaryExpectationDTO salaryExpectationDTO;

}
