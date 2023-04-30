package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDAO_impl;
import com.DB.DB_Connect;
import com.Entity.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String email = request.getParameter("email");
			String psw = request.getParameter("password");
			
			UserDAO_impl dao = new UserDAO_impl(DB_Connect.getConnect());
			HttpSession session = request.getSession();
			
			if("csushant224@gmail.com".equals(email) && "1234".equals(psw)) {
				
				User usr1 = new User();
				usr1.setName("Admin");
				session.setAttribute("userObj", usr1);
				response.sendRedirect("Admin/Homes.jsp");
			}else {
				User us = dao.Login(email, psw);
				if(us != null) {
					session.setAttribute("userObj", us);
					response.sendRedirect("index.jsp");
				}else {
					session.setAttribute("failMsg", "Email and Password Invalid");
					response.sendRedirect("Login.jsp");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
