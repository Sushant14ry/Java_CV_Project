package com.DAO;

import java.util.ArrayList;
import java.util.List;

import com.Entity.Book_Details;

public interface BookDAO {

	public boolean addBook(Book_Details bd);
	
	public List<Book_Details> getAllBooks();
	
	public Book_Details getBookById(int bid);
	
	public boolean UpdateBooks(Book_Details bid);
	
	public boolean DeleteBooks(int bid);
	
	public List<Book_Details> getNewBooks();
	
	public List<Book_Details> getRecentBooks();
	
	public List<Book_Details> getOldBooks();
	
	public List<Book_Details> getAllBooksInRecentPage();
	
	public List<Book_Details> getAllBooksInNewBookPage();
	
	public List<Book_Details> getAllBooksInOldBookPage();
	
	public List<Book_Details> getUserOldBooks(String email, String cate);
	
	public boolean Remove_OldBook_from_User(String email, String cate, int bid);
	
	public List<Book_Details> getBookBySearch(String srch_char);
	
}
