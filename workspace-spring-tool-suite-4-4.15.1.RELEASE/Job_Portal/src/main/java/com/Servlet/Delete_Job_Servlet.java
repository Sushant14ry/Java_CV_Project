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

@WebServlet("/del_job_post")
public class Delete_Job_Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			int delJob_id = Integer.parseInt(req.getParameter("id"));

			Job_DAO dao = new Job_DAO(DB_Connection.getConn());
			boolean f = dao.DeleteJobPost(delJob_id);
			HttpSession session = req.getSession();

			if (f) {
				session.setAttribute("adjdMsg", "Job Post Deleted Successfully");
				resp.sendRedirect("view_jobs.jsp");
			} else {
				session.setAttribute("adjMsg", "Something Went Wrong");
				resp.sendRedirect("view_jobs.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
