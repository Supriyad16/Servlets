package com.xworkz.eommerce.service;

import com.xworkz.eommerce.dto.EcommerceDTO;

public interface EcommerceService {

    String validate(EcommerceDTO ecommerceDTO);

    default EcommerceDTO findById(int id) {
        return null;

    }
}
