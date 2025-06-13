package com.xworkz.general.servlet;

import com.xworkz.general.dto.PassportDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/passport", loadOnStartup = 1)
public class PassportServlet extends HttpServlet {

    public PassportServlet() {
        System.out.println("Running PassportServlet...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        String name = req.getParameter("name");
        String adhar = req.getParameter("adhar");
        String address = req.getParameter("address");
        String pno = req.getParameter("pno");
        String country = req.getParameter("country");
        String state = req.getParameter("state");
        String city = req.getParameter("city");
        String pcode = req.getParameter("pcode");
        String passportType = req.getParameter("passportType");
        String pay = req.getParameter("pay");

        PassportDTO dto = new PassportDTO(name, adhar, address, pno, country,
                state, city, pcode, passportType, pay);

        System.out.println("Received PassportDTO: " + dto);
        System.out.println("Name="+name+"Adhar="+adhar+"Address="+address+"Pan Number="+pno+"Country="+country+"State="+state+"PinCode="+pcode+"Experience="+passportType+"Payment Number="+pay);

        req.setAttribute("dto", dto);
        RequestDispatcher dispatcher = req.getRequestDispatcher("passportResult.jsp");
        dispatcher.forward(req, resp);
    }
}
