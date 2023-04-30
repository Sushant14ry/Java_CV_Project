package com.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class Logout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cks = req.getCookies();
		cks[0].setMaxAge(0);
		cks[1].setMaxAge(0);
		
		resp.addCookie(cks[0]);
		resp.addCookie(cks[1]);
		
		resp.sendRedirect("index.html");
	}

	
}
