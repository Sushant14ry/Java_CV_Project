package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.User_Dao_Impl;
import com.db.DB_Connect;
import com.entity.User;
@WebServlet("/register")
public class Register_Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String phone = req.getParameter("phone");
			String password = req.getParameter("password");
			String check = req.getParameter("check");
			
		
			User us = new User();
			us.setName(name);
			us.setEmail(email);
			us.setPhone(phone);
			us.setPassword(password);
			
			User_Dao_Impl udi = new User_Dao_Impl(DB_Connect.getConn());
			boolean f = udi.userRegister(us);
			PrintWriter out = resp.getWriter();
			HttpSession session = req.getSession();
			
			if(f) {
				System.out.println("User Register Success.........");
				session.setAttribute("regis_suces", "Registration Successfully....");
				resp.sendRedirect("register.jsp");
			}else {
				System.out.println("Something Went Wrong on Server........");
				session.setAttribute("regis_fail", "Something Went Wrong on Server....");
				resp.sendRedirect("register.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
