package com.xworkz.system.dto;

import lombok.*;

import java.util.List;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor

public class InspectorDTO {

    private String name;
    private int badgeNumber;
    private String department;
    private int yearsOfService;

    private List<ExperienceDTO> experienceDTO;


}
