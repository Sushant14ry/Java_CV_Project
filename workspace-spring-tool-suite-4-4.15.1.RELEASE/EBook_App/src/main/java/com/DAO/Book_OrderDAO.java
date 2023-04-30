package com.DAO;

import java.util.List;

import com.Entity.Book_Order;

public interface Book_OrderDAO {
	
	public boolean SaverBookOrder(List<Book_Order> blist);
	
	public List<Book_Order> getOrderedBooks(String email);
	
	public List<Book_Order> getAllOrderedBooks();
}
