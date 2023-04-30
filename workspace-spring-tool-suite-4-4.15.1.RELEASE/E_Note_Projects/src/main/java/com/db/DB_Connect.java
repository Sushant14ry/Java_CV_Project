package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connect {

	private static Connection conn;
	
	public static Connection getConn()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebook_app","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
}
