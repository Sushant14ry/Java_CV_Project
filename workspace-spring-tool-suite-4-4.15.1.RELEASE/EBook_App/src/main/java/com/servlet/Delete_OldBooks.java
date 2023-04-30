package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.BookADO_impl;
import com.DB.DB_Connect;

@WebServlet("/remove_oldBook")
public class Delete_OldBooks extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			

			String userEmail = req.getParameter("usremail");
			int oldBookId = Integer.parseInt(req.getParameter("obid"));
			
			System.out.println("Email Id"+ userEmail);
			
			BookADO_impl dao = new BookADO_impl(DB_Connect.getConnect());
			boolean f = dao.Remove_OldBook_from_User(userEmail, "Old", oldBookId);
			HttpSession session = req.getSession();
			
			if(f) {
				session.setAttribute("delsucMsg", "Old Book Delete Successfully" );
				resp.sendRedirect("user_all_old_Books.jsp");
				System.out.println("Book Delete Successfully");
			}else {
				session.setAttribute("delcfailMsg", "Something Wrong on Server" );
				resp.sendRedirect("user_all_old_Books.jsp");
				System.out.println("Something Wrong on Server");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
