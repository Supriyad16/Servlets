package com.xworkz.dance.service;

import com.xworkz.dance.dto.DanceDTO;
import com.xworkz.dance.repository.DanceRepository;
import com.xworkz.dance.repository.DanceRepositoryImp;

public class DanceServiceImp implements DanceService {
    @Override
    public String validate(DanceDTO danceDTO) {

        if (danceDTO != null) {

            String name = danceDTO.getName();

            if (name != null && name.length() > 4 && name.length() < 30) {
                System.out.println("name is valid");
            } else {
                System.out.println("Name is invalid");
                return "please enter valid details";
            }

            int age = danceDTO.getAge();

            if (age > 5 && age < 35) {
                System.out.println("Age is valid");
            } else {
                System.out.println("Age is invalid");
                return "please enter valid age";
            }

            String gender= danceDTO.getGender();

            if (gender != null){
                System.out.println("Gender is valid");
            } else {
                System.out.println("Gender is empty");
                return "Please select Gender";
            }

            String style = danceDTO.getStyle();

            if(style!=null){
                System.out.println("Dance Style is valid");
            }else {
                System.out.println("Dance Style is empty");
                return "Please select Dance Style";
            }

            String experience = danceDTO.getExperience();

            if(experience!=null){
                System.out.println("Previous Dance Experience is valid");
            }else {
                System.out.println("Previous Dance Experience is empty");
                return "Please select Previous Dance Experience";
            }



            Long number = danceDTO.getPhone();

            if (number != null && String.valueOf(number).length() == 10) {
                System.out.println("Phone number is valid");
            } else {
                System.out.println("Phone number is invalid");
                return "Please enter a valid 10-digit phone number";
            }


            String address = danceDTO.getAddress();

            if (address != null && address.length() > 5 && address.length() < 30) {
                System.out.println("Address is valid");
            } else {
                System.out.println("Address is invalid");
                return "Please enter a valid address (6–29 characters)";
            }


            DanceRepository danceRepository = new DanceRepositoryImp();
             danceRepository.save(danceDTO);
        }
        return "Details saved successfully";
    }
}
