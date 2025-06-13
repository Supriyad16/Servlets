package com.xworkz.general.servlet;

import com.xworkz.general.dto.DrivingDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/driving", loadOnStartup = 1)
public class DrivingServlet extends HttpServlet {

    public DrivingServlet() {
        System.out.println("Running DrivingServlet...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String mobile = req.getParameter("mobile");
        String appliedDate = req.getParameter("appliedDate");
        String vehicleType = req.getParameter("vehicleType");

        DrivingDTO dto = new DrivingDTO(name, address, mobile, appliedDate, vehicleType);
        System.out.println("Received DrivingDTO: " + dto);
        System.out.println("Name="+name+"Address="+address+"Mobile="+mobile+"Applied Date="+appliedDate+"Vehicle Type="+vehicleType);

        req.setAttribute("dto", dto);
        RequestDispatcher dispatcher = req.getRequestDispatcher("drivingResult.jsp");
        dispatcher.forward(req, resp);
    }
}
