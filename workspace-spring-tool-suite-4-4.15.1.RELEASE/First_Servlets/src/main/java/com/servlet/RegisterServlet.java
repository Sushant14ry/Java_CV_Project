package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Welcome to Register Servlet");
		
		String name = request.getParameter("user_name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String user_gender = request.getParameter("user_gender");
		String user_course = request.getParameter("user_course");
		String condition = request.getParameter("condition");
		
		if(condition.equals("checked")) {
			System.out.println("<h2> Name :"+ name + "</h2>");
			System.out.println("<h2> Password : "+ password + "</h2>");
			System.out.println("<h2> Email : "+ email + "</h2>");
			System.out.println("<h2> Gender : "+ user_gender + "</h2>");
			System.out.println("<h2> Course : "+ user_course + "</h2>");
		}else {
			System.out.println("You have not Accept Term and Conditions");
		}
		
		doGet(request, response);
	}

}
