package com.admin.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.BookADO_impl;
import com.DB.DB_Connect;

@WebServlet("/delete")
public class Books_Delete_Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int delBookID = Integer.parseInt(req.getParameter("ids"));
		
		BookADO_impl bdi = new BookADO_impl(DB_Connect.getConnect());
		boolean delb = bdi.DeleteBooks(delBookID);
		HttpSession session = req.getSession();
		
		if(delb) {
			session.setAttribute("esucMsg", "Book Delete Successfully...");
			resp.sendRedirect("Admin/allBooks.jsp");
		}else {
			session.setAttribute("efailMsg", "Something Went Wrong on Server");
			resp.sendRedirect("Admin/allBooks.jsp");
		}
	}

	
}
