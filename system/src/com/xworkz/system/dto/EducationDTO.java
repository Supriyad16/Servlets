package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor


public class EducationDTO {

    private String degree;
    private String fieldOfStudy;
    private int graduationYear;
    private String institutionName;

    private UniversityDTO universityDTO;

}
