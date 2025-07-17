package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor

public class DesignationDTO {

    private String title;
    private int level;
    private String department;
    private String grade;

    private RoleDTO roleDTO;

}
