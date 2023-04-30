package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Entity.Book_Details;

public class BookADO_impl implements BookDAO {

	private Connection conn;
	
	public BookADO_impl(Connection conn) {
		super();
		this.conn = conn;
	}

	/* Insert Books in Database */
	public boolean addBook(Book_Details bd) {	
		boolean f = false;
		
		try {
			String ins_sql = "insert into book_details(bookname, bookauthor, bookprice, bookcategory,bookstatus, bookimg,useremail) values(?,?,?,?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(ins_sql);
			ps.setString(1, bd.getBookname());
			ps.setString(2, bd.getBookauthor());
			ps.setString(3, bd.getBookprice());
			ps.setString(4, bd.getBookcategory());
			ps.setString(5, bd.getBookstatus());
			ps.setString(6, bd.getBookimg());
			ps.setString(7, bd.getEmail());
			
			int i = ps.executeUpdate();
			if(i == 1) {
				f= true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}

	/* Show and Fetch All Books from Database */
	public List<Book_Details> getAllBooks() {
		
		List<Book_Details> list = new ArrayList<Book_Details>();
		Book_Details bk = null;
		
		try {
			
			String showBook = "select * from book_details";
			PreparedStatement ps = conn.prepareStatement(showBook);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				bk = new Book_Details();
				bk.setBookid(rs.getInt(1));
				bk.setBookname(rs.getString(2));
				bk.setBookauthor(rs.getString(3));
				bk.setBookprice(rs.getString(4));
				bk.setBookcategory(rs.getString(5));
				bk.setBookstatus(rs.getString(6));
				bk.setBookimg(rs.getString(7));
				bk.setEmail(rs.getString(8));
				list.add(bk);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}

	/* Find Particular Books from Database */
	public Book_Details getBookById(int bid) {
		
		Book_Details bk = null;
		
		try {
			
			String findbook = "select * from book_details where bookid=? ";
			PreparedStatement ps = conn.prepareStatement(findbook);
			ps.setInt(1, bid);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				bk = new Book_Details();
				bk.setBookid(rs.getInt(1));
				bk.setBookname(rs.getString(2));
				bk.setBookauthor(rs.getString(3));
				bk.setBookprice(rs.getString(4));
				bk.setBookcategory(rs.getString(5));
				bk.setBookstatus(rs.getString(6));
				bk.setBookimg(rs.getString(7));
				bk.setEmail(rs.getString(8));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bk;
	}

	/* Update Books in Database */
	public boolean UpdateBooks(Book_Details bid) {
	
		boolean f = false;
		
		try {
			
			String updBook = "update book_details set bookname=?, bookauthor=?, bookprice=?, bookcategory=?, bookstatus=? where bookid=? ";
			PreparedStatement ps = conn.prepareStatement(updBook);
			ps.setString(1, bid.getBookname());
			ps.setString(2, bid.getBookauthor());
			ps.setString(3, bid.getBookprice());
			ps.setString(4, bid.getBookcategory());
			ps.setString(5, bid.getBookstatus());
			ps.setInt(6, bid.getBookid());
			
			int i = ps.executeUpdate();
			
			if(i == 1) {
				f = true;
			}
				
		} catch (Exception e) {
			
		}
		
		
		
		return f;
	}
	
	/* Delete Books from Database */
	public boolean DeleteBooks(int bid) {
		boolean f = false;
		
		try {
			
			String delBook = "delete from book_details where bookid=? ";
			
			PreparedStatement ps = conn.prepareStatement(delBook);
			ps.setInt(1, bid);
			
			int i = ps.executeUpdate();
			if(i == 1) {
				f = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}

	/* Show and Fetch New Books from Database in Home Section Page */
	public List<Book_Details> getNewBooks() {
		
		List<Book_Details> list = new ArrayList<Book_Details>();
		Book_Details b= null;
		try {
			
			String sql = "select * from book_details where bookcategory=? and bookstatus=? order by bookid DESC ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,"New");
			ps.setString(2, "Active");
			
			ResultSet rs = ps.executeQuery();
			int i = 1;
			while(rs.next() && i<= 4) {
				
				b = new Book_Details();
				b.setBookid(rs.getInt(1));
				b.setBookname(rs.getString(2));
				b.setBookauthor(rs.getString(3));
				b.setBookprice(rs.getString(4));
				b.setBookcategory(rs.getString(5));
				b.setBookstatus(rs.getString(6));
				b.setBookimg(rs.getString(7));
				list.add(b);
				i++;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
				
	}

	/* Show and Fetch Recent Books from Database in Home Section Page */
	public List<Book_Details> getRecentBooks() {
		List<Book_Details> list = new ArrayList<Book_Details>();
		Book_Details b= null;
		try {
			
			String sql = "select * from book_details where bookstatus=? order by bookid DESC ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "Active");
			
			ResultSet rs = ps.executeQuery();
			int i = 1;
			while(rs.next() && i<= 4) {
				
				b = new Book_Details();
				b.setBookid(rs.getInt(1));
				b.setBookname(rs.getString(2));
				b.setBookauthor(rs.getString(3));
				b.setBookprice(rs.getString(4));
				b.setBookcategory(rs.getString(5));
				b.setBookstatus(rs.getString(6));
				b.setBookimg(rs.getString(7));
				list.add(b);
				i++;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	/* Show and Fetch Old Books from Database in Home Section Page */
	public List<Book_Details> getOldBooks() {

		List<Book_Details> list = new ArrayList<Book_Details>();
		Book_Details b= null;
		try {
			
			String sql = "select * from book_details where bookcategory=? and bookstatus=? order by bookid DESC ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,"Old");
			ps.setString(2, "Active");
			
			ResultSet rs = ps.executeQuery();
			int i = 1;
			while(rs.next() && i<= 4) {
				
				b = new Book_Details();
				b.setBookid(rs.getInt(1));
				b.setBookname(rs.getString(2));
				b.setBookauthor(rs.getString(3));
				b.setBookprice(rs.getString(4));
				b.setBookcategory(rs.getString(5));
				b.setBookstatus(rs.getString(6));
				b.setBookimg(rs.getString(7));
				list.add(b);
				i++;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	/* Show and Fetch All Recent Books from Database in Recent Section Page */
	public List<Book_Details> getAllBooksInRecentPage() {
		List<Book_Details> listrepg = new ArrayList<Book_Details>();
		Book_Details b= null;
		try {
			
			String sql = "select * from book_details where bookstatus=? order by bookid DESC ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "Active");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				b = new Book_Details();
				b.setBookid(rs.getInt(1));
				b.setBookname(rs.getString(2));
				b.setBookauthor(rs.getString(3));
				b.setBookprice(rs.getString(4));
				b.setBookcategory(rs.getString(5));
				b.setBookstatus(rs.getString(6));
				b.setBookimg(rs.getString(7));
				listrepg.add(b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listrepg;
	}

	public List<Book_Details> getAllBooksInNewBookPage() {
			
		List<Book_Details> listnwp = new ArrayList<Book_Details>();
		Book_Details b= null;
		try {
			
			String sql = "select * from book_details where bookcategory=? and bookstatus=? order by bookid DESC ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,"New");
			ps.setString(2, "Active");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				b = new Book_Details();
				b.setBookid(rs.getInt(1));
				b.setBookname(rs.getString(2));
				b.setBookauthor(rs.getString(3));
				b.setBookprice(rs.getString(4));  
				b.setBookcategory(rs.getString(5));
				b.setBookstatus(rs.getString(6));
				b.setBookimg(rs.getString(7));
				listnwp.add(b);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listnwp;
	}

	/* Fetch and show Only Old Books */
	public List<Book_Details> getAllBooksInOldBookPage() {
		List<Book_Details> listoldp = new ArrayList<Book_Details>();
		Book_Details b= null;
		try {
			
			String sql = "select * from book_details where bookcategory=? and bookstatus=? order by bookid DESC ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,"Old");
			ps.setString(2, "Active");
			
			ResultSet rs = ps.executeQuery();
			int i = 1;
			while(rs.next()) {
				
				b = new Book_Details();
				b.setBookid(rs.getInt(1));
				b.setBookname(rs.getString(2));
				b.setBookauthor(rs.getString(3));
				b.setBookprice(rs.getString(4));
				b.setBookcategory(rs.getString(5));
				b.setBookstatus(rs.getString(6));
				b.setBookimg(rs.getString(7));
				listoldp.add(b);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listoldp;
	}

	/* Fetch and show Old Books who Uploaded */
	public List<Book_Details> getUserOldBooks(String email, String cate) {
		
		List<Book_Details> listoldb = new ArrayList<Book_Details>();
		Book_Details bk = null;
		try {
			
			String userBook = "select * from book_details where bookcategory=? and useremail=? ";
			PreparedStatement ps = conn.prepareStatement(userBook);
			ps.setString(1, cate);
			ps.setString(2, email);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				bk = new Book_Details();
				bk.setBookid(rs.getInt(1));
				bk.setBookname(rs.getString(2));
				bk.setBookauthor(rs.getString(3));
				bk.setBookprice(rs.getString(4));
				bk.setBookcategory(rs.getString(5));
				bk.setBookstatus(rs.getString(6));
				bk.setBookimg(rs.getString(7));
				listoldb.add(bk);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listoldb;
	}

	/* Remove Old Books From User Account */
	public boolean Remove_OldBook_from_User(String email, String cate, int bid) {
		boolean f = false;
		try {
			
			String remoldbk =  "delete from book_details where bookcategory=? and useremail=? and bookid=? ";
			PreparedStatement ps = conn.prepareStatement(remoldbk);
			ps.setString(1, cate);
			ps.setString(2, email);
			ps.setInt(3, bid);
			
			int i = ps.executeUpdate();
			if(i == 1 ) {
				f = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return f;
	}

	/*Search Books from Database */
	public List<Book_Details> getBookBySearch(String srch_char) {
		List<Book_Details> listoldb = new ArrayList<Book_Details>();
		Book_Details bk = null;
		try {
			
			String userBook = "select * from book_details where bookname like ? or bookauthor like ? or bookcategory like ? and bookstatus=?  ";
			PreparedStatement ps = conn.prepareStatement(userBook);
			ps.setString(1, "%"+srch_char+"%");
			ps.setString(2, "%"+srch_char+"%");
			ps.setString(3, "%"+srch_char+"%");
			ps.setString(4, "Active");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				bk = new Book_Details();
				bk.setBookid(rs.getInt(1));
				bk.setBookname(rs.getString(2));
				bk.setBookauthor(rs.getString(3));
				bk.setBookprice(rs.getString(4));
				bk.setBookcategory(rs.getString(5));
				bk.setBookstatus(rs.getString(6));
				bk.setBookimg(rs.getString(7));
				listoldb.add(bk);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listoldb;
	}

}
