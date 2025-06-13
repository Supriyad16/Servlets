package com.xworkz.general.service;

import com.xworkz.general.dto.BirthDTO;

public class BirthServiceImp implements BirthService{
    @Override
    public String validate(BirthDTO birthDTO) {
        return "false" ;
    }
}
