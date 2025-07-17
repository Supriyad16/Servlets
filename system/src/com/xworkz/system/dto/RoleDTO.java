package com.xworkz.system.dto;

import lombok.*;

import java.util.List;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor

public class RoleDTO {

    private String roleName;
    private String department;
    private String responsibilities;
    private boolean isLeadership;

    private List<CriteriaDTO> criteriaDTO;

}
