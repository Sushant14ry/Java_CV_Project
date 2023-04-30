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
import com.entity.Post;

/**
 * Servlet implementation class AddNoteServlet
 */
@WebServlet("/AddNotes_Servlet")
public class AddNoteServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int uid = Integer.parseInt(request.getParameter("userId"));
		String title = request.getParameter("p_title");
		String content = request.getParameter("p_content");
		
		PostDao dao = new PostDao(DB_Connect.getConn());
		boolean f =	dao.AddNotes(title, content, uid);
		HttpSession session = null;
		
		if(f)
		{
			session = request.getSession();
			session.setAttribute("add_msg", "Notes Added Success");
			System.out.println("data Insert Successfully");
			response.sendRedirect("show_notes.jsp");
		}else {
			session = request.getSession();
			session.setAttribute("add_msg", "Failed to Add Notes");
			System.out.println("data Insert Successfully");
			response.sendRedirect("show_notes.jsp");
		}
		
	}

}
