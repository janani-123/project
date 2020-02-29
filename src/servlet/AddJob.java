package servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegisterDao;
import dto.AddJobDto;
import util.AddJobValidate;


@WebServlet("/addjob")
public class AddJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddJob() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String organisationname=request.getParameter("organisationname");
		String jobdescription=request.getParameter("jobdescription");
		String expectedexpirience=request.getParameter("expectedexpirence");
		String skills=request.getParameter("skills");
		String salary=request.getParameter("salary");
		
		AddJobDto add =new AddJobDto();
		add.setOrganisationname(organisationname);
		add.setExpectedexpirience(expectedexpirience);
		add.setJobdescription(jobdescription);
		add.setSkills(skills);
		add.setSalary(salary);
		
		AddJobValidate validate=new AddJobValidate();
		Map<String,String> errormessages= validate.validate(add);
		 if(errormessages.size()>0) {
			 request.setAttribute("errormessages", errormessages);
			 request.getRequestDispatcher("addjob.jsp").forward(request, response);;
			 
		 }
		 else {
			 RegisterDao dao=new RegisterDao();
			boolean result= dao.addjob(add);
			
			if(result) {
				request.getRequestDispatcher("publishedjob.jsp").forward(request, response);
			}
			else {
				request.setAttribute("sqlerror", "internal error required");
				request.getRequestDispatcher("addjob.jsp").forward(request, response);
			}
			
				}
				}
	


		
	}


