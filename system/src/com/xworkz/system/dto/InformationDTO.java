package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor

public class InformationDTO {

    private String source;
    private String type;
    private String description;
    private int dateCollected;

    private MayorDTO mayorDTO;

}
