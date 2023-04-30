package com.Entity;

public class Book_Order {

	private int id;
	private String order_id;
	private String username;
	private String useremail;
	private String phone;
	private String fulladdress;
	private String book_name;
	private String book_author;
	private String book_price;	
	private String payment;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFulladdress() {
		return fulladdress;
	}
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_price() {
		return book_price;
	}
	public void setBook_price(String book_price) {
		this.book_price = book_price;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public Book_Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book_Order(int id, String order_id, String username, String useremail, String phone, String fulladdress,
			String book_name, String book_author, String book_price, String payment) {
		super();
		this.id = id;
		this.order_id = order_id;
		this.username = username;
		this.useremail = useremail;
		this.phone = phone;
		this.fulladdress = fulladdress;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_price = book_price;
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "Book_Order [id=" + id + ", order_id=" + order_id + ", username=" + username + ", useremail=" + useremail
				+ ", phone=" + phone + ", fulladdress=" + fulladdress + ", book_name=" + book_name + ", book_author="
				+ book_author + ", book_price=" + book_price + ", payment=" + payment + "]";
	}

	
	
	
	
}
