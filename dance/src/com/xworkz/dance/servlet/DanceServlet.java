package com.xworkz.dance.servlet;

import com.xworkz.dance.dto.DanceDTO;
import com.xworkz.dance.repository.DanceRepository;
import com.xworkz.dance.repository.DanceRepositoryImp;
import com.xworkz.dance.service.DanceService;
import com.xworkz.dance.service.DanceServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/dance", loadOnStartup = 1)
public class DanceServlet extends HttpServlet {

    public DanceServlet(){
        System.out.println("Running Dance Service");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String name = req.getParameter("name");
        String ageStr = req.getParameter("age");
        int age = Integer.parseInt(ageStr);
        String gender = req.getParameter("gender");
        String style = req.getParameter("style");
        String experience = req.getParameter("experience");
        String availabilityStr = req.getParameter("availability");
        boolean availability = Boolean.parseBoolean(availabilityStr);
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");

        DanceDTO danceDTO = new DanceDTO(name, age, gender,style,experience,availability,phone,address);
        System.out.println("Name="+name+" Age="+age+" Gender="+" Style="+style+" Experience="+experience+" Availability="+availability+" Phone="+phone+" Address="+address);

        DanceService danceService = new DanceServiceImp();
        danceService.validate(danceDTO);

        DanceRepository danceRepository = new DanceRepositoryImp();
        danceRepository.save(danceDTO);

        req.setAttribute("dto", danceDTO);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("danceResult.jsp");
        requestDispatcher.forward(req, res);

    }
}