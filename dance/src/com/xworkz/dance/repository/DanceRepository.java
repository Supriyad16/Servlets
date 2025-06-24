package com.xworkz.dance.repository;

import com.xworkz.dance.dto.DanceDTO;

public interface DanceRepository {

    String save(DanceDTO danceDTO);


    DanceDTO findById(int id);

}
