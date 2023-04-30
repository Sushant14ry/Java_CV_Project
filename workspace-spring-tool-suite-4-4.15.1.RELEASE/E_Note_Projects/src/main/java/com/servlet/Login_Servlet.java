package com.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.User_Dao;
import com.dao.User_Dao_Impl;
import com.db.DB_Connect;
import com.entity.User;
import com.mysql.cj.xdevapi.DbDoc;

/**
 * Servlet implementation class Login_Servlet
 */
@WebServlet("/Login_Servlet")
public class Login_Servlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String Psw = request.getParameter("psw");
		
		User us = new User();
		us.setEmail(email);
		us.setPassword(Psw);
		
		User_Dao_Impl daoi = new User_Dao_Impl(DB_Connect.getConn());
		User usr = daoi.LoginUser(us);
		HttpSession session = request.getSession();
		
		if(usr != null)
		{
			session.setAttribute("user_detail", usr);
			response.sendRedirect("Home.jsp");
		}else {
			session.setAttribute("login_fail","Invalid Username and Password Not Matched !!");
			response.sendRedirect("login.jsp");
		}
		
	}

}
