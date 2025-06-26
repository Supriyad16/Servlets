package com.xworkz.eommerce.servlet;

import com.xworkz.eommerce.dto.EcommerceDTO;
import com.xworkz.eommerce.service.EcommerceService;
import com.xworkz.eommerce.service.EcommerceServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login", loadOnStartup = 1)
public class EcommerceServlet extends HttpServlet {

    public EcommerceServlet() {
        System.out.println("Running EcommerceServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String userid = req.getParameter("userid");
        String password = req.getParameter("password");
        String cpassword = req.getParameter("cpassword");

        EcommerceDTO ecommerceDTO = new EcommerceDTO(email, userid, password, cpassword);
        System.out.println("Email:" + email + " User Id:" + userid + " Password:" + password + " Confirm Password:" + cpassword);

        EcommerceService ecommerceService = new EcommerceServiceImp();
        String result = ecommerceService.validate(ecommerceDTO);



        if (!result.equals("Sign-Up Successfully")) {
            req.setAttribute("dto", ecommerceDTO);
            req.setAttribute("errorMessage", result);
        }
        else{
            req.setAttribute("message", result);
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("ecommerce.jsp");
        requestDispatcher.forward(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        int convertedId = Integer.parseInt(id);

        System.out.println("Converted " + convertedId);

        EcommerceService ecommerceService = new EcommerceServiceImp();
        EcommerceDTO ecommerceDTO= ecommerceService.findById(convertedId);
        System.out.println(ecommerceDTO);

        req.setAttribute("Email","email");
        req.setAttribute("Userid","userid");
        req.setAttribute("Password","password");
        req.setAttribute("Created_at","created_at");

        req.setAttribute("result","Result");

        if (ecommerceDTO == null) {
            String message="data not found";
            req.setAttribute("failMessage",message);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("search.jsp");
            requestDispatcher.forward(req,resp);

        } else {
            String message="data  found";
            req.setAttribute("message",message);
            req.setAttribute("dto",ecommerceDTO);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("result.jsp");
            requestDispatcher.forward(req,resp);

        }




    }
}