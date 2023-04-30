package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.Cart_DAO_impl;
import com.DB.DB_Connect;

@WebServlet("/remove_book")
public class Remove_Cart_Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int CartBookId = Integer.parseInt(req.getParameter("cbid"));
		int CartUserId = Integer.parseInt(req.getParameter("uid"));
		int CarId = Integer.parseInt(req.getParameter("cid"));
		
		Cart_DAO_impl cdo = new Cart_DAO_impl(DB_Connect.getConnect());
		boolean f = cdo.removeBookCart(CartBookId,CartUserId,CarId);
		HttpSession session = req.getSession();
		
		if(f) {
			session.setAttribute("csucMsg", "Book Removed from Cart" );
			resp.sendRedirect("CheckOut.jsp");
			System.out.println("Book Removed from Cart");
		}else {
			session.setAttribute("cfailMsg", "Something Wrong on Server" );
			resp.sendRedirect("CheckOut.jsp");
			System.out.println("Something Wrong on Server");
		}
	}

}
