package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.PostDao;
import com.db.DB_Connect;

/**
 * Servlet implementation class Delete_servlet
 */
@WebServlet("/Delete_servlet")
public class Delete_servlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer del_note_id = Integer.parseInt(request.getParameter("note_id"));
		
		PostDao pdo = new PostDao(DB_Connect.getConn());
		boolean f = pdo.DeletePost(del_note_id);
		
		HttpSession session = null;
		
		if(f)
		{
			session = request.getSession();
			session.setAttribute("delete_msg", "Notes Delete Sucessfully");
			response.sendRedirect("show_notes.jsp");
			System.out.println("Notes Delete Sucessfully");
		}else {
			System.out.println("Failed to Delete Notes");
			session = request.getSession();
			session.setAttribute("fail_del_nsg", "Failed to Delete Notes");
			response.sendRedirect("show_notes.jsp");
			System.out.println("Failed to Delete Notes");
		}
		
		
	}

}
