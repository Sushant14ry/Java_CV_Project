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
import com.Entity.Book_Details;

@WebServlet("/UpdateBooks")
public class Edit_Books_Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			int bookEdit_Id = Integer.parseInt(req.getParameter("bid"));
			String bookname = req.getParameter("bookname");
			String bookauthor = req.getParameter("bookauthor");
			String bookprice = req.getParameter("bookprice");
			String bookcategory = req.getParameter("bookcategory");
			String bookstatus = req.getParameter("bookstatus");
			
			Book_Details b = new Book_Details();
			b.setBookid(bookEdit_Id);
			b.setBookname(bookname);
			b.setBookauthor(bookauthor);
			b.setBookprice(bookprice);
			b.setBookcategory(bookcategory);
			b.setBookstatus(bookstatus);
			
			BookADO_impl bdi = new BookADO_impl(DB_Connect.getConnect());
			boolean bok = bdi.UpdateBooks(b);
			HttpSession session = req.getSession();
			
			if(bok) {
				session.setAttribute("esucMsg", "Book Update Successfully...");
				resp.sendRedirect("Admin/allBooks.jsp");
			}else {
				session.setAttribute("efailMsg", "Something Went Wrong on Server");
				resp.sendRedirect("Admin/allBooks.jsp");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
