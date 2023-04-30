package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Entity.Book_Details;
import com.Entity.Cart;

public class Cart_DAO_impl implements Cart_DAO {
	
	private Connection conn;
	
	public Cart_DAO_impl(Connection conn) {
		this.conn = conn;
	}
	
	/* Add To Cart Option */
	public boolean addCart(Cart c) {
		boolean f = false;
		
		try {
		
			String insCart = "insert into cart(book_id,user_id,book_name,book_author,book_price,toal_price) values(?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(insCart);
			ps.setInt(1, c.getBook_id());
			ps.setInt(2, c.getUser_id());
			ps.setString(3, c.getBook_name());
			ps.setString(4, c.getBook_author());
			ps.setDouble(5, c.getBook_price());
			ps.setDouble(6, c.getToal_price());
			
			int i = ps.executeUpdate();
			if(i==1) {
				f = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	/* Fetch and show all Add to Cart data from database */
	public List<Cart> getBookByUser(int userId) {
	
		List<Cart> list = new ArrayList<Cart>();
		Cart c = null;
		double totalPrice = 0;
		try {
			
			String CartData = "select * from cart where user_id=? ";
			PreparedStatement ps = conn.prepareStatement(CartData);
			ps.setInt(1, userId);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				c = new Cart();
				c.setCart_id(rs.getInt(1));
				c.setBook_id(rs.getInt(2));
				c.setUser_id(rs.getInt(3));
				c.setBook_name(rs.getString(4));
				c.setBook_author(rs.getNString(5));
				c.setBook_price(rs.getDouble(6));
				
				totalPrice = totalPrice+rs.getDouble(7);
				c.setToal_price(totalPrice);
				list.add(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}


	/* Delete or Remove Book Add to Cart data from database */
	public boolean removeBookCart(int cbid, int cuid, int cid) {
		boolean f = false;
		try {
			
			String removeCart = "delete from cart where book_id=? and user_id=? and cart_id=? ";
			PreparedStatement ps = conn.prepareStatement(removeCart);
			ps.setInt(1, cbid);
			ps.setInt(2, cuid);
			ps.setInt(3, cid);
			
			int i = ps.executeUpdate();
			if(i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return f;
	}

	

	
}
