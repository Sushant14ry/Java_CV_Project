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

@WebServlet("/upd_profile")
public class Update_Profile_Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {

			int usrId = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String qaulification = req.getParameter("qualification");
			String psw = req.getParameter("psw");

			User u = new User();
			u.setId(usrId);
			u.setName(name);
			u.setEmail(email);
			u.setQualification(qaulification);
			u.setPsw(psw);

			UserDAO udao = new UserDAO(DB_Connection.getConn());
			boolean f = udao.Upd_User_Profile(u);
			HttpSession session = req.getSession();

			if (f) {
				session.setAttribute("pudpsMsg", "Profile Update Successfully");
				resp.sendRedirect("Edit_profile.jsp");
			} else {
				session.setAttribute("updfMsg", "Something Went Wrong");
				resp.sendRedirect("Edit_profile.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
