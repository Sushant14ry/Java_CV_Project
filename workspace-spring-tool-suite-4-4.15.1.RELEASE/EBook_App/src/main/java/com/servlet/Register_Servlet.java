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

@WebServlet("/register")
public class Register_Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String password = req.getParameter("password");
		String checkbox = req.getParameter("check");

		User u = new User();
		u.setName(name);
		u.setEmail(email);
		u.setPhone(phone);
		u.setPassword(password);

		HttpSession session = req.getSession();

		if (checkbox != null) {
			UserDAO_impl udi = new UserDAO_impl(DB_Connect.getConnect());
			boolean checkUser = udi.CheckUser(email);
			
			if (checkUser) {
				boolean reg = udi.UserRegister(u);

				if (reg) {

					session.setAttribute("uinMsg", "User Registration Successfully");
					resp.sendRedirect("Register.jsp");
					System.out.println("User Insert Success.......");
				} else {
					session.setAttribute("failMsg", "Something Went Wrong on Server...");
					resp.sendRedirect("Register.jsp");
					System.out.println("Something Went Wrong on Server...");
				}
			} else {
				session.setAttribute("failMsg", "User Already Exist and Try Another Email ID");
				resp.sendRedirect("Register.jsp");
				System.out.println("Something Went Wrong on Server...");
			}

		} else {
			session.setAttribute("chkboxMsg", "Please Check Agree Terms and Conditions");
			resp.sendRedirect("Register.jsp");
			System.out.println("Please Check Agree Terms and Conditions");
		}

	}
}
