package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile_servlet")
public class Profile extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie[] ckies = req.getCookies();
		
		if(ckies == null) 
		{	
			resp.sendRedirect("index.html");
		}else {
			resp.setContentType("text/html");	
			PrintWriter out = resp.getWriter();
			
			out.println("<h1>Email : "+ckies[0].getValue()+"</h1>");
			out.println("<h1>Password : "+ckies[1].getValue()+"</h1>");
			out.println("<a href='logout'>Logout</a>");
			
		}
		
	}

	
}
