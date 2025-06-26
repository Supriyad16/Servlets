package com.xworkz.eommerce.repository;

import com.xworkz.eommerce.dto.EcommerceDTO;

public interface EcommerceRepository {

    String save (EcommerceDTO ecommerceDTO);

    EcommerceDTO findById(int id);
}
