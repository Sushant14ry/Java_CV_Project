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

@WebServlet("/register_user")
public class Register_Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			String fname = req.getParameter("name");
			String email = req.getParameter("email");
			String qualification = req.getParameter("qualification");
			String psw = req.getParameter("psw");
			
			User u = new User();
			u.setName(fname);
			u.setEmail(email);
			u.setQualification(qualification);
			u.setPsw(psw);
			
			UserDAO udo = new UserDAO(DB_Connection.getConn());
			boolean f = udo.RegisterUser(u);
			HttpSession session = req.getSession();
			
			if(f) {
				session.setAttribute("regsMsg", "User Registered Success");
				resp.sendRedirect("Login.jsp");
			}else {
				session.setAttribute("regsfMsg", "Failed to Registered User");
				resp.sendRedirect("Register.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
