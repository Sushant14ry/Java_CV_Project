package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Entity.Book_Order;

public class Book_OrderDAO_impl implements Book_OrderDAO {

	private Connection conn;
	
	public Book_OrderDAO_impl(Connection conn) {
		super();
		this.conn = conn;
	}

	/* User Ordered Books */
	public boolean SaverBookOrder(List<Book_Order> blist) {
		
		boolean f = false;
		try {
			String insOrder = "insert into book_order(order_id,username,useremail,phone,fulladdress,book_name,book_author,book_price,payment) values(?,?,?,?,?,?,?,?,?) ";
			conn.setAutoCommit(false);
			PreparedStatement ps = conn.prepareStatement(insOrder);
			
			for(Book_Order b : blist) {
				ps.setString(1, b.getOrder_id());
				ps.setString(2, b.getUsername());
				ps.setString(3, b.getUseremail());
				ps.setString(4, b.getFulladdress());
				ps.setString(5, b.getPhone());
				ps.setString(6, b.getBook_name());
				ps.setString(7, b.getBook_author());
				ps.setString(8, b.getBook_price());
				ps.setString(9, b.getPayment());
				ps.addBatch();
			}
			
			int[] count = ps.executeBatch();
			conn.commit();
			f= true;
			conn.setAutoCommit(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
		
	}

	/* Fetch and Show  User All Ordered Books */
	public List<Book_Order> getOrderedBooks(String email) {
		
		List<Book_Order> bolist = new ArrayList<Book_Order>();
		Book_Order bo = null;
		
		try {
			String showOrderBooks = "select * from book_order where useremail=? ";
			PreparedStatement pst = conn.prepareStatement(showOrderBooks);
			pst.setString(1, email);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				bo = new Book_Order();
				bo.setId(rs.getInt(1));
				bo.setOrder_id(rs.getString(2));
				bo.setUsername(rs.getString(3));
				bo.setUseremail(rs.getString(4));
				bo.setFulladdress(rs.getString(5));
				bo.setPhone(rs.getString(6));
				bo.setBook_name(rs.getString(7));
				bo.setBook_author(rs.getString(8));
				bo.setBook_price(rs.getString(9));
				bo.setPayment(rs.getString(10));
				bolist.add(bo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bolist;
	}

	/* Fetch and Show  All User Ordered Books */
	public List<Book_Order> getAllOrderedBooks() {
		List<Book_Order> bolist = new ArrayList<Book_Order>();
		Book_Order bo = null;
		
		try {
			String showallOrderBooks = "select * from book_order ";
			PreparedStatement pst = conn.prepareStatement(showallOrderBooks);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				bo = new Book_Order();
				bo.setId(rs.getInt(1));
				bo.setOrder_id(rs.getString(2));
				bo.setUsername(rs.getString(3));
				bo.setUseremail(rs.getString(4));
				bo.setFulladdress(rs.getString(5));
				bo.setPhone(rs.getString(6));
				bo.setBook_name(rs.getString(7));
				bo.setBook_author(rs.getString(8));
				bo.setBook_price(rs.getString(9));
				bo.setPayment(rs.getString(10));
				bolist.add(bo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bolist;
	}

	
}
