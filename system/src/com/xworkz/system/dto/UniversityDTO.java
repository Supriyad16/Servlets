package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor

public class UniversityDTO {

    private String universityName;
    private String location;
    private int establishedYear;
    private String accreditation;

    private PresidentDTO presidentDTO;

}
