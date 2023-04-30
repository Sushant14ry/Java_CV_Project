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

@WebServlet("/add_job")
public class Add_Job_Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			String title = req.getParameter("title");
			String location = req.getParameter("location");
			String category = req.getParameter("category");
			String status = req.getParameter("status");
			String description = req.getParameter("description");
			
			Jobs j = new Jobs();
			j.setTitle(title);
			j.setLocation(location);
			j.setCategory(category);
			j.setStatus(status);
			j.setDescription(description);
			
			Job_DAO dao = new Job_DAO(DB_Connection.getConn());
			boolean adj = dao.Add_Jobs(j);
			
			HttpSession session = req.getSession();
			
			if(adj) {
				session.setAttribute("adjMsg", "Job Post Successfully");
				resp.sendRedirect("add_jobs.jsp");
			}else {
				session.setAttribute("adjfMsg", "Something Went Wrong");
				resp.sendRedirect("add_jobs.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
