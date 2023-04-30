package com.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("psw");
		
		Cookie cke = new Cookie("eml", email);
		Cookie ckp = new Cookie("pass", password);
		
		resp.addCookie(cke);
		resp.addCookie(ckp);
		
		resp.sendRedirect("profile_servlet");
	}

	
}
