package com.xworkz.system.dto;

import lombok.*;

import java.util.List;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor


public class CompanyDTO {

    private String companyName;
    private String industryType;
    private int establishedYear;
    private String headquarters;

    private List<OwnerDTO> ownerDTO;

}
