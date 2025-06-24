package com.xworkz.dance.service;


import com.xworkz.dance.dto.DanceDTO;

public interface DanceService {

    String validate(DanceDTO danceDTO);

    default DanceDTO findById(int id) {

        return null;
    }


}
