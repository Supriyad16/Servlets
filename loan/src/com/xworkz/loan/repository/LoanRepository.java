package com.xworkz.loan.repository;

import com.xworkz.loan.dto.LoanDTO;

public interface LoanRepository {

    String save(LoanDTO loanDTO);

    LoanRepository findById(int id);
}
