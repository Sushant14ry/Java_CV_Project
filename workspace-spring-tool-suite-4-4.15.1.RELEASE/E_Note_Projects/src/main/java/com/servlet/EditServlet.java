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
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			Integer pst_id = Integer.parseInt(request.getParameter("pst_id"));
			String p_title = request.getParameter("p_title");
			String p_content = request.getParameter("p_content");
			
			PostDao pdo = new PostDao(DB_Connect.getConn());
			boolean f = pdo.PostUpdate( pst_id,p_title, p_content);
			
			HttpSession session = request.getSession();
			session.setAttribute("upd_msg", "Notes Update Successfully");
			response.sendRedirect("show_notes.jsp");
			
			if(f)
			{
				System.out.println("Data update Successfully");
			}else {
				System.out.println("Faled to Update Data");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
