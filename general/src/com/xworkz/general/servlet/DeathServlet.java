package com.xworkz.general.servlet;

import com.xworkz.general.dto.DeathDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/death", loadOnStartup = 1)
public class DeathServlet extends HttpServlet {

    public DeathServlet() {
        System.out.println("Running DeathServlet...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        String name = req.getParameter("name");
        String cause = req.getParameter("cause");
        String date = req.getParameter("dates");
        String time = req.getParameter("times");
        String age = req.getParameter("age");
        String hname = req.getParameter("hname");
        String manner = req.getParameter("manner");
        String marks = req.getParameter("marks");
        String gender = req.getParameter("gender");

        DeathDTO dto = new DeathDTO(name, cause, date, time, age, hname, manner, marks, gender);
        System.out.println("Received DeathDTO: " + dto);
        System.out.println("Name="+name+"Cause="+cause+"Date="+date+"Time="+time+"Age at death="+age+"Hospital Name="+hname+"Manner="+manner+"Marks="+marks+"Gender="+gender);

        req.setAttribute("dto", dto);

        RequestDispatcher dispatcher = req.getRequestDispatcher("deathResult.jsp");
        dispatcher.forward(req, resp);
    }
}
