package com.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDAO;
import com.DB.DB_Connection;
import com.entity.User;

@WebServlet("/Login")
public class Login_Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			
			String email = req.getParameter("email");
			String psw = req.getParameter("psw");
			
			User u = new User();
			HttpSession session = req.getSession();
			
			
			if("csushant@gmail.com".equals(email) && "1234".equals(psw)) {
				
				session.setAttribute("usrObj", u);
				u.setRole("Admin");
				resp.sendRedirect("admin.jsp");
			}else {
				
				UserDAO udo = new UserDAO(DB_Connection.getConn());
				User user = udo.LoginUser(email, psw);
				if(user != null) {
					session.setAttribute("usrObj", user);
					resp.sendRedirect("home.jsp");
				}else {
					session.setAttribute("fregMsg", "Invalid Email and Password");
					resp.sendRedirect("Login.jsp");
				}
			}
			
			
		} catch (Exception e) {
			
		}
		
	}

	
}
