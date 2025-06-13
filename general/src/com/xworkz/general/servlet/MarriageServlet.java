package com.xworkz.general.servlet;

import com.xworkz.general.dto.MarriageDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/marriage", loadOnStartup = 1)
public class MarriageServlet extends HttpServlet {

    public MarriageServlet() {
        System.out.println("Running MarriageServlet...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {



        String groomName = req.getParameter("groomName");
        String brideName = req.getParameter("brideName");
        String location = req.getParameter("location");
        String address = req.getParameter("address");
        String religion = req.getParameter("religion");
        String date = req.getParameter("date");
        String witness1 = req.getParameter("witness1");
        String witness2 = req.getParameter("witness2");
        String officer = req.getParameter("officer");

        MarriageDTO dto = new MarriageDTO(groomName, brideName, location, address, religion,
                date, witness1, witness2, officer);

        System.out.println("Received MarriageDTO: " + dto);
        System.out.println("Groon Name="+groomName+"Bride Name="+brideName+"Location="+location+"Address="+address+"Religion="+religion+"Date="+date+"Witness1="+witness1+"Witness2="+witness2);

        req.setAttribute("dto", dto);
        RequestDispatcher dispatcher = req.getRequestDispatcher("marriageResult.jsp");
        dispatcher.forward(req, resp);
    }
}
