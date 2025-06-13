package com.xworkz.general.servlet;

import com.xworkz.general.dto.BirthDTO;
import com.xworkz.general.repository.BirthRepository;
import com.xworkz.general.repository.BirthRepositoryImp;
import com.xworkz.general.service.BirthService;
import com.xworkz.general.service.BirthServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/birth", loadOnStartup = 1)
public class BirthServlet extends HttpServlet {

    public BirthServlet() {
        System.out.println("Running BirthServlet...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {



        String bid = req.getParameter("bid");
        String name = req.getParameter("name");
        String fname = req.getParameter("fname");
        String mname = req.getParameter("mname");
        String dates = req.getParameter("dates");
        String times = req.getParameter("times");
        String dname = req.getParameter("dname");
        String nname = req.getParameter("nname");

        BirthDTO dto = new BirthDTO(bid, name, fname, mname, dates, times, dname, nname);
        System.out.println("Received BirthDTO: " + dto);
        System.out.println("Name="+name+"Father NAme="+fname+"Mother Name="+mname+"Date="+dates+"Time="+times+"Doctor Name="+dname+"Nurse NAme="+name);

        BirthService birthService=new BirthServiceImp();
        String result=birthService.validate(dto);
        System.out.println(result);

        BirthRepository birthRepository = new BirthRepositoryImp();
        String output = birthRepository.save(dto);
        System.out.println(output);



        req.setAttribute("dto", dto);

        RequestDispatcher dispatcher = req.getRequestDispatcher("birthResult.jsp");
        dispatcher.forward(req, resp);
    }
}
