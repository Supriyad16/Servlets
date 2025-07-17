package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor


public class ExperienceDTO {

    private String companyName;
    private String jobTitle;
    private int yearsOfExperience;
    private String domain;

    private EducationDTO educationDTO;

}
