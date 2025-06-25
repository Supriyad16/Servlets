package com.xworkz.loan.service;

import com.xworkz.loan.dto.LoanDTO;
import com.xworkz.loan.repository.LoanRepository;
import com.xworkz.loan.repository.LoanRepositoryImp;

import java.io.Serializable;

public class LoanServiceImp implements LoanService {

    public String validate(LoanDTO loanDTO) {


        if (loanDTO != null) {
            String name = loanDTO.getName();

            if (name != null && name.length() > 4 && name.length() < 30) {
                System.out.println("name is valid");
            } else {
                System.out.println("Name is invalid");
                return "please enter valid details";
            }

            int age = loanDTO.getAge();

            if (age > 5 && age < 35) {
                System.out.println("Age is valid");
            } else {
                System.out.println("Age is invalid");
                return "please enter valid age";
            }

            String gender = loanDTO.getGender();

            if (gender != null) {
                System.out.println("Gender is valid");
            } else {
                System.out.println("Gender is empty");
                return "Please select Gender";
            }

            String number = loanDTO.getPhone();

            if (number != null && String.valueOf(number).length() == 10) {
                System.out.println("Phone number is valid");
            } else {
                System.out.println("Phone number is invalid");
                return "Please enter a valid 10-digit phone number";
            }

            String address = loanDTO.getAddress();

            if (address != null && address.length() > 5 && address.length() < 30) {
                System.out.println("Address is valid");
            } else {
                System.out.println("Address is invalid");
                return "Please enter a valid address (6–29 characters)";
            }

            String loan_type = loanDTO.getLoan_type();

            if (loan_type != null) {
                System.out.println("Loan Type is valid");
            } else {
                System.out.println("Loan Type is empty");
                return "Please select Loan Type";
            }

            int tenure = loanDTO.getTenure();

            if (tenure > 1 && tenure < 30) {
                System.out.println("tenure is valid");
            } else {
                System.out.println("tenure is empty");
                return "Please select tenure";
            }

            LoanRepository loanRepository = new LoanRepositoryImp();
            loanRepository.save(loanDTO);

        }

        return "Details saved successfully";
    }

//    public LoanDTO findById(int id) {
//        LoanRepository loanRepository;
//        if (id < 0) {
//            System.out.println("Id is invalid");
//            return null;
//        } else {
//            System.out.println("Id is valid");
//            loanRepository = new LoanRepositoryImp();
//            //  return
//        }
//
//        return loanRepository.findById(id);
//
//    }


}



