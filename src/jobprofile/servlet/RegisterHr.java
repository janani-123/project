package jobprofile.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobprofile.dao.RegisterDao;
import jobprofile.dto.HrDto;
import jobprofile.util.HrValidation;


@WebServlet("/registerhr")
public class RegisterHr extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String fullname =request.getParameter("fullname");
			String organisationname=request.getParameter("organisationname");
			String email=request.getParameter("email");
			String mobile=request.getParameter("mobile");
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			
			HrDto register=new HrDto();
			register.setFullname(fullname);
			register.setOrganisationname(organisationname);
			register.setMobile(mobile);
			register.setEmail(email);
			register.setUsername(username);
			register.setPassword(password);

		    
			HrValidation validation=new HrValidation();
			 Map<String,String>   errormessages= validation.validate(register);
			
			 if(errormessages.size()>0) {
				 request.setAttribute("errormessages", errormessages);
				 request.getRequestDispatcher("registerhr.jsp").forward(request, response);;
				 
			 }else {
				 RegisterDao dao=new RegisterDao();
				boolean result= dao.register(register);
				
				if(result) {
					request.getRequestDispatcher("loginhr.jsp").forward(request, response);
				}
				else {
					request.setAttribute("sqlerror", "internal error required");
					request.getRequestDispatcher("registerhr.jsp").forward(request, response);
				}
				
					}
		}
}

