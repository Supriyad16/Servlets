package com.xworkz.system.dto;

import lombok.*;

@Setter
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor

public class RTODTO {

    private int rtoCode;
    private String location;
    private String jurisdictionArea;
    private long contactNumber;

    private InspectorDTO inspectorDTO;

}
