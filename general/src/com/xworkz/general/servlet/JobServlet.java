package com.xworkz.general.servlet;

import com.xworkz.general.dto.JobDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/job", loadOnStartup = 1)
public class JobServlet extends HttpServlet {

    public JobServlet() {
        System.out.println("Running JobServlet...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {



        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String education = req.getParameter("education");
        String skills = req.getParameter("skills");
        String salary = req.getParameter("salary");
        String experience = req.getParameter("experience");

        JobDTO dto = new JobDTO(name, email, education, skills, salary, experience);
        System.out.println("Received JobDTO: " + dto);
        System.out.println("Name="+name+"Email="+email+"Education="+education+"Skills"+skills+"Salary="+salary+"Experience="+experience);

        req.setAttribute("dto", dto);
        RequestDispatcher dispatcher = req.getRequestDispatcher("jobResult.jsp");
        dispatcher.forward(req, resp);
    }
}
