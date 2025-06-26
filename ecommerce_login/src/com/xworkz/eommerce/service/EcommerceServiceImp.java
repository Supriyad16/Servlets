package com.xworkz.eommerce.service;

import com.xworkz.eommerce.dto.EcommerceDTO;
import com.xworkz.eommerce.repository.EcommerceRepository;
import com.xworkz.eommerce.repository.EcommerceRepositoryImp;

public class EcommerceServiceImp implements EcommerceService{
    @Override
    public String validate(EcommerceDTO ecommerceDTO) {

        if(ecommerceDTO!=null) {

            String email = ecommerceDTO.getEmail();

            if(email!=null && email.contains("@")){
                System.out.println("Email is valid");
            }
            else{
                System.out.println("Email is invalid");
                return "Please enter valid Email";
            }


            String userid = ecommerceDTO.getUserid();

            if(userid!=null && userid.length()>3 && userid.matches(".*[0-9].*")){
                System.out.println("User Id is valid");
            }
            else{
                System.out.println("User Id is invalid");
                return "Please enter valid User Id";
            }

            String password = ecommerceDTO.getPassword();

            if(password!=null && password.length()>7 && password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).+$")) {
                System.out.println("Password is valid");
            } else {
                System.out.println("Password is invalid");
                return "Please enter valid Password";
            }

            String cpassword = ecommerceDTO.getCpassword();

            if(cpassword!=null && cpassword.equals(password)){
                System.out.println("Password is Correct");
            } else {
                System.out.println("Password is Incorrect");
                return "Password is not matching";
            }

            EcommerceRepository ecommerceRepository = new EcommerceRepositoryImp();
            ecommerceRepository.save(ecommerceDTO);
            }

        return "Sign-Up Successfully";
    }

    public EcommerceDTO findById(int id) {
        if(id<0){
            System.out.println("Id is invalid");

            return null;
        }
        else{
            System.out.println("Id is valid");
            EcommerceRepository ecommerceRepository = new EcommerceRepositoryImp();
            return ecommerceRepository.findById(id);
        }

    }
}




