package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("nm");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<form action='servlet2'> <input type='hidden' name='user' value='"+name+"'><br>"
					+"<button type='submit'>Servlet 2</button></form>");
		
	}
}
