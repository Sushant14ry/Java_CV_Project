package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.Book_OrderDAO_impl;
import com.DAO.Cart_DAO_impl;
import com.DB.DB_Connect;
import com.Entity.Book_Order;
import com.Entity.Cart;

@WebServlet("/order")
public class Order_Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {

			int userId = Integer.parseInt(req.getParameter("id"));

			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String phone = req.getParameter("phone");
			String address = req.getParameter("address");
			String landmark = req.getParameter("landmark");
			String city = req.getParameter("city");
			String state = req.getParameter("state");
			String pincode = req.getParameter("pincode");
			String payment = req.getParameter("payment");

			String fullAddress = address + "," + landmark + "," + city + "," + state + "," + pincode;

			Cart_DAO_impl cdao = new Cart_DAO_impl(DB_Connect.getConnect());
			List<Cart> clist = cdao.getBookByUser(userId);
			HttpSession session = req.getSession();

			if (clist.isEmpty()) {
				session.setAttribute("nlcrtMsg", "Please Choose Add Item First");
				resp.sendRedirect("CheckOut.jsp");
			} else {
				Book_OrderDAO_impl bodi = new Book_OrderDAO_impl(DB_Connect.getConnect());
				Book_Order o = null;

				Random r = new Random();
				ArrayList<Book_Order> ordlist = new ArrayList<Book_Order>();
				
				for (Cart c : clist) {

					o = new Book_Order();
					o.setOrder_id("Book ORD-00" + r.nextInt(99999));
					o.setUsername(name);
					o.setUseremail(email);
					o.setPhone(phone);
					o.setFulladdress(fullAddress);
					o.setBook_name(c.getBook_name());
					o.setBook_author(c.getBook_author());
					o.setBook_price(c.getBook_price() + "");
					o.setPayment(payment);
					ordlist.add(o);

				}

				if ("noSelect".equals(payment)) {
					session.setAttribute("pyMsg", "Please Choose Your Payment Method");
					resp.sendRedirect("CheckOut.jsp");
				} else {
					boolean f = bodi.SaverBookOrder(ordlist);
					if (f) {
						session.setAttribute("ordrMsg", "Thank You");
						resp.sendRedirect("Order_Sucess.jsp");
						System.out.println("Order Success");
					} else {
						session.setAttribute("fordrMsg", "Your Order Failed");
						resp.sendRedirect("Order_Sucess.jsp");
						System.out.println("Failed Order");
					}
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
