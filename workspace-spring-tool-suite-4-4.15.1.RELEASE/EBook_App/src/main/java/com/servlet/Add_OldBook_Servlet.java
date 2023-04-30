package com.servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.DAO.BookADO_impl;
import com.DB.DB_Connect;
import com.Entity.Book_Details;

@WebServlet("/addOldBook")
@MultipartConfig
public class Add_OldBook_Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String bookname = req.getParameter("bookname");
		String bookauthor = req.getParameter("bookauthor");
		String bookprice = req.getParameter("bookprice");
		String bookcategory = "old";
		String bookstatus = "active";
		Part part = req.getPart("bookimg");
		String filename = part.getSubmittedFileName();
		
		String UserEmail = req.getParameter("UserEmail");
		
		Book_Details bd = new Book_Details();
		bd.setBookname(bookname);
		bd.setBookauthor(bookauthor);
		bd.setBookprice(bookprice);
		bd.setBookcategory(bookcategory);
		bd.setBookstatus(bookstatus);
		bd.setBookimg(filename);
		bd.setEmail(UserEmail);
		
		BookADO_impl dao = new BookADO_impl(DB_Connect.getConnect());
		boolean f = dao.addBook(bd);
		
		HttpSession session = req.getSession();
		
		if(f)
		{
			String path = getServletContext().getRealPath("")+"book_Photos";
			System.out.println(path);
			
			File file = new File(path);
			part.write(path+File.separator+filename);
			
			session.setAttribute("succMsg", "Book Add Successfully");
			resp.sendRedirect("SellBook.jsp");
			System.out.println("Old Book Insert Success");
		}else {
			session.setAttribute("failMsg", "Something Went Wrong on Server");
			resp.sendRedirect("SellBook.jsp");
			System.out.println("Fail to Insert Data");
		}
	}

}
