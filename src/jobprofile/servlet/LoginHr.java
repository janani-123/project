package jobprofile.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobprofile.dao.RegisterDao;
import jobprofile.dto.HrDto;

@WebServlet("/loginhr")
public class LoginHr extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		
		RegisterDao dao=new RegisterDao();
	boolean result=dao.login(username,password);
		
		if(result==false) {
			request.setAttribute("sqlerror","internal error occured");
			request.getRequestDispatcher("loginhr.jsp").forward(request, response);
		}
		else {
			
			request.getRequestDispatcher("add.jsp").forward(request, response);
		}
	}

}
