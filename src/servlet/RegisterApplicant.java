package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.RegisterApplicantDto;
import dto.RegisterHrDto;
import util.RegisterApplicantValidation;
import util.RegisterHrValidation;

/**
 * Servlet implementation class RegisterApplicant
 */
@WebServlet("/registerapplicant")
public class RegisterApplicant extends HttpServlet implements Servlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullname =request.getParameter("fullname");
		String mobile=request.getParameter("mobile");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		RegisterApplicantDto register=new RegisterApplicantDto();
		register.setFullname(fullname);
        register.setMobile(mobile);
        register.setUsername(username);
		register.setPassword(password);

	    PrintWriter out=response.getWriter();
		RegisterApplicantValidation validation=new RegisterApplicantValidation();
		 Map<String,String>   errormessages= validation.validate(register);
		
		 if(errormessages.size()>0) {
			 request.setAttribute("errormessages", errormessages);
			 request.getRequestDispatcher("registerapplicant.jsp").forward(request, response);;
			 
		 }else {
			 
			 EntityManagerFactory entityManagerFactor=Persistence.createEntityManagerFactory("jobprofile");
				EntityManager entityManager=entityManagerFactor.createEntityManager();
				EntityTransaction transcation=entityManager.getTransaction();
				out.println("Inserted");
				try {
					transcation.begin();
					entityManager.persist(register);
					transcation.commit();
				}catch(Exception e) {
					e.printStackTrace();
					transcation.rollback();
				}finally {
					entityManager.close();
					entityManagerFactor.close();
				}
				}
	}

}
