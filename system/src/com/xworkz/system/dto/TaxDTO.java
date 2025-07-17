package com.xworkz.system.dto;



import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor

public class TaxDTO {

    private String taxType;
    private double rateInPercent;
    private String applicableTo;
    private String taxableEvent;

    private GovernmentDTO governmentDTO;

}
