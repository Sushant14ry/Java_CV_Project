package com.Entity;

public class Book_Details {

	private int bookid;
	private String bookname;
	private String bookauthor;
	private String bookprice;
	private String bookcategory;
	private String bookstatus;
	private String bookimg;
	private String email;
	 
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public String getBookprice() {
		return bookprice;
	}
	public void setBookprice(String bookprice) {
		this.bookprice = bookprice;
	}
	public String getBookcategory() {
		return bookcategory;
	}
	public void setBookcategory(String bookcategory) {
		this.bookcategory = bookcategory;
	}
	public String getBookstatus() {
		return bookstatus;
	}
	public void setBookstatus(String bookstatus) {
		this.bookstatus = bookstatus;
	}
	public String getBookimg() {
		return bookimg;
	}
	public void setBookimg(String bookimg) {
		this.bookimg = bookimg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Book_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book_Details(int bookid, String bookname, String bookauthor, String bookprice, String bookcategory,
			String bookstatus, String bookimg, String email) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookprice = bookprice;
		this.bookcategory = bookcategory;
		this.bookstatus = bookstatus;
		this.bookimg = bookimg;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Book_Details [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor
				+ ", bookprice=" + bookprice + ", bookcategory=" + bookcategory + ", bookstatus=" + bookstatus
				+ ", bookimg=" + bookimg + ", email=" + email + "]";
	}
	
	
	
}
