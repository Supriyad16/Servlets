package com.xworkz.loan.service;

import com.xworkz.loan.dto.LoanDTO;

public interface LoanService {

    String validate(LoanDTO loanDTO);

    default LoanDTO findById(int id) {

        return null;
    }

}


