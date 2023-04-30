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

@WebServlet("/update_profile")
public class Update_Profile_Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int userId = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String phone = req.getParameter("phone");
			String password = req.getParameter("password");
			
			User usr = new User();
			usr.setId(userId);
			usr.setName(name);
			usr.setEmail(email);
			usr.setPhone(phone);
			
			UserDAO_impl dao = new UserDAO_impl(DB_Connect.getConnect());
			boolean f = dao.CheckPassword(password, userId);
			HttpSession session = req.getSession();
			
			if(f) {
				
				boolean f2 = dao.UpdateProfile(usr);
				if(f2) {
					session.setAttribute("pswcucMsg","User Profile Update Successfully");
					resp.sendRedirect("Edit_Profile.jsp");
					System.out.println("User Profile Update Successfully");
				}else {
					session.setAttribute("pswfMsg","Fail to Update User Profile");
					resp.sendRedirect("Edit_Profile.jsp");
					System.out.println("Fail to Update User Profile");
				}
			}else {
				session.setAttribute("pswfMsg","Password Incorrect");
				resp.sendRedirect("Edit_Profile.jsp");
				System.out.println("Incorrect Password");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
