package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor


public class ProductDTO {

    private String productName;
    private String category;
    private double price;
    private String manufacturer;

    private CompanyDTO companyDTO;


}
