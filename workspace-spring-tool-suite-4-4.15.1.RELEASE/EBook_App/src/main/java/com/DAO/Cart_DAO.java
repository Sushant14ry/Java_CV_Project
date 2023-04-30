package com.DAO;

import java.util.List;

import com.Entity.Book_Details;
import com.Entity.Cart;

public interface Cart_DAO {

	public boolean addCart(Cart c);
	
	public List<Cart> getBookByUser(int userId);
	
	public boolean removeBookCart(int cbid, int cuid, int cid);
	
	
}
