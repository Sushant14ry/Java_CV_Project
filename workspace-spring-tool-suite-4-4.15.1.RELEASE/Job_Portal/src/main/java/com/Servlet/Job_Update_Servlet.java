package com.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.Job_DAO;
import com.DB.DB_Connection;
import com.entity.Jobs;

@WebServlet("/update_job")
public class Job_Update_Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			int jobid = Integer.parseInt(req.getParameter("id"));
			String title = req.getParameter("title");
			String location = req.getParameter("location");
			String category = req.getParameter("category");
			String status = req.getParameter("status");
			String description = req.getParameter("description");
			
			Jobs j = new Jobs();
			j.setId(jobid);
			j.setTitle(title);
			j.setCategory(category);
			j.setLocation(location);
			j.setStatus(status);
			j.setDescription(description);
			
			Job_DAO dao = new Job_DAO(DB_Connection.getConn());
			boolean adj = dao.UpdateJobPost(j);
			
			HttpSession session = req.getSession();
			
			if(adj) {
				session.setAttribute("adjuMsg", "Job Post Update Successfully");
				resp.sendRedirect("view_jobs.jsp");
			}else {
				session.setAttribute("adjfMsg", "Something Went Wrong");
				resp.sendRedirect("view_jobs.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
