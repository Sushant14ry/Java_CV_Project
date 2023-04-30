package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.BookADO_impl;
import com.DAO.BookDAO;
import com.DAO.Cart_DAO_impl;
import com.DB.DB_Connect;
import com.Entity.Book_Details;
import com.Entity.Cart;

@WebServlet("/cart")
public class Cart_Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		try {
			
			int bookId = Integer.parseInt(req.getParameter("bid"));
			int userId = Integer.parseInt(req.getParameter("uid"));
			
			BookADO_impl bdo = new BookADO_impl(DB_Connect.getConnect());
			Book_Details bk  = bdo.getBookById(bookId);
			
			Cart c = new Cart();
			c.setBook_id(bookId);
			c.setUser_id(userId);
			c.setBook_name(bk.getBookname());
			c.setBook_author(bk.getBookauthor());
			c.setBook_price(Double.parseDouble(bk.getBookprice()));
			c.setToal_price(Double.parseDouble(bk.getBookprice()));
			
			Cart_DAO_impl cdo = new Cart_DAO_impl(DB_Connect.getConnect());
			boolean addCart = cdo.addCart(c);
			HttpSession session = req.getSession();
			
			if(addCart) {
				session.setAttribute("addCart","Book Added to Cart");
				resp.sendRedirect("All_newBooks.jsp");
				System.out.println("Add Cart Success");
			}else {
				session.setAttribute("failaddCart","Failed to Add Cart Books");
				resp.sendRedirect("All_newBooks.jsp");
				System.out.println("Failed to Add Cart");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
