package com.xworkz.loan.servlet;

import com.xworkz.loan.dto.LoanDTO;
import com.xworkz.loan.repository.LoanRepository;
import com.xworkz.loan.repository.LoanRepositoryImp;
import com.xworkz.loan.service.LoanService;
import com.xworkz.loan.service.LoanServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/loan", loadOnStartup = 1)
public class LoanServlet extends HttpServlet {

    public LoanServlet() {
        System.out.println("Running Loan Servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String age1 = req.getParameter("age");
        int age = Integer.parseInt(age1);
        String gender = req.getParameter("gender");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        String loan_type = req.getParameter("loan_type");
        String amount1 = req.getParameter("amount");
        int amount = Integer.parseInt(amount1);
        String tenure1 = req.getParameter("tenure");
        int tenure = Integer.parseInt(tenure1);

        LoanDTO loanDTO = new LoanDTO(name, age, gender, phone, address, loan_type, amount, tenure);
        System.out.println("Name: "+name+" Age: "+age+" Gender: "+gender+" Phone: "+phone+" Address: "+address+" Loan Type: "+loan_type+" Loan Amount: "+amount+" Loan Tenure: "+tenure);

        LoanService loanService = new LoanServiceImp();
        String result = loanService.validate(loanDTO);

       req.setAttribute("message", result);

       if(!result.equals("Details saved successfully"))
       {
           req.setAttribute("dto",loanDTO);
       }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("loan.jsp");
        requestDispatcher.forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id1 = req.getParameter("id");
        int id = Integer.parseInt(id1);

        System.out.println("Details by Id = "+id);

        LoanService loanService = new LoanServiceImp();
        LoanDTO loanDTO = loanService.findById(id);

        if(loanDTO==null){
            System.out.println("invalid");
        }

        else{
            System.out.println("valid");
        }
    }
}
