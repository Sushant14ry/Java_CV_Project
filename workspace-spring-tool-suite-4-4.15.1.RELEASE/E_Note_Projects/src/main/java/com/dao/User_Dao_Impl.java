package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.User;

public class User_Dao_Impl implements User_Dao {

	private Connection conn;
	
	public User_Dao_Impl(Connection conn) {
		super();
		this.conn = conn;
	}


	@Override
	public boolean userRegister(User us) {
		boolean f = false;
		
		try {
			String query = "INSERT INTO `user`(`name`, `email`, `phone`, `password`) VALUES (?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1, us.getName());
			ps.setString(2, us.getEmail());
			ps.setString(3, us.getPhone());
			ps.setString(4, us.getPassword());
			
			int res = ps.executeUpdate();
			if(res == 1) {
				f= true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}


	@Override
	public boolean Register_Servlet(User us) {
		// TODO Auto-generated method stub
		return false;
	}


	public User LoginUser(User us) 
	{	
		User us_details = null;
		try {
			
			String qry = "select * from user where email=? and password=? ";
			
			PreparedStatement ps = conn.prepareStatement(qry);
			ps.setString(1, us.getEmail());
			ps.setString(2, us.getPassword());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				us_details = new User();
				us_details.setId(rs.getInt("user_id"));
				us_details.setName(rs.getString("name"));
				us_details.setEmail(rs.getString("email"));
				us_details.setPassword(rs.getString("password"));
				us_details.setPhone(rs.getString("phone"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return us_details;
	}
	
}
