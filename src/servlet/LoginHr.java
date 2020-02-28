package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegisterDao;
import dto.HrDto;

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
		HrDto register=new HrDto();
		
		RegisterDao dao=new RegisterDao();
		HrDto registerhr=dao.login(register);
		
		if(registerhr!=null) {
			request.setAttribute("sqlerror","internal error occured");
			request.getRequestDispatcher("registerhr.jsp").forward(request, response);
		}
		else {
			request.setAttribute("sqlerror","internal error occured");
			request.getRequestDispatcher("loginhr.jsp").forward(request, response);
		}
	}

}
