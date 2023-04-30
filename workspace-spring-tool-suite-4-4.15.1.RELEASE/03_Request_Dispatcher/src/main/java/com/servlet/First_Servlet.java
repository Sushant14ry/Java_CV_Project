package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

@WebServlet("/login")
public class First_Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String email = req.getParameter("email");
		String password = req.getParameter("psw");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		RequestDispatcher rd;
		
		if("demo@gmail.com".equals(email) && "demo".equals(password)) 
		{
			// Home Page Redirect 
			/*
			 * rd = req.getRequestDispatcher("/servlet2"); rd.forward(req, resp);
			 */
			resp.sendRedirect("servlet2");
			
			
		}else {
			// Redirect Login Page
			out.println("<h4> Invalid Email and Password </h4> ");
			System.out.println("Invalid Email and Password");
			rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}
	
}
