package jobprofile.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobprofile.dao.RegisterDao;
import jobprofile.dto.Job;

@WebServlet("/publishedjob")
public class PublishedJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
        public PublishedJob() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Job job=new Job();
	
	
		RegisterDao register=new RegisterDao();
		List<Job> records=register.display(job.getId());
		
		if(records.size()>0) {
			request.setAttribute("records", records);
			request.getRequestDispatcher("publishedjob.jsp").forward(request, response);
			
		}
		else {
			request.setAttribute("sqlerror","internalerrocurred");
			request.getRequestDispatcher("addjob.jsp").forward(request, response);
		}
	}

}
