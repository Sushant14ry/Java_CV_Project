package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register_Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name= req.getParameter("username");
		String user_email= req.getParameter("user_email");
		String user_psw= req.getParameter("user_psw");
		String course= req.getParameter("course");
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>Name : "+name+"</h1>");
		out.println("<h1>Email : "+user_email+"</h1>");
		out.println("<h1>Password : "+user_psw+"</h1>");
		out.println("<h1>Course : "+course+"</h1>");
		
		
	}
	
}
