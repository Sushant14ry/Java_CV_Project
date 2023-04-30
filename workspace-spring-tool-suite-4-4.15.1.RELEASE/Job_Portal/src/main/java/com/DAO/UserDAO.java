package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.User;

public class UserDAO {

	private Connection conn;

	public UserDAO(Connection conn) {
		super();
		this.conn = conn;
	}
	
	/* User Registered */
	public boolean RegisterUser(User u) {
		
		boolean f = false;
		try {
			
			String regUser = "insert into user(name,email,psw,qualification,role) values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(regUser);
			ps.setString(1, u.getName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPsw());
			ps.setString(4, u.getQualification());
			ps.setString(5, "User");
			
			int i = ps.executeUpdate();
			if(i == 1) {
				f = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	/* User Login */
	public User LoginUser(String email, String psw) {
		
		User u = null;
		try {
			
			String login = "select * from user where email=? and psw=? ";
			PreparedStatement pst = conn.prepareStatement(login);
			pst.setString(1, email);
			pst.setString(2, psw);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				u = new User();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPsw(rs.getString(4));
				u.setQualification(rs.getString(5));
				u.setRole(rs.getString(6));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;	
	}
	
	public boolean Upd_User_Profile(User u) {
		
		boolean f = false;
		try {
			
			String regUser = "update user set name=?, email=?, psw=?, qualification=? where id=? ";
			PreparedStatement ps = conn.prepareStatement(regUser);
			ps.setString(1, u.getName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPsw());
			ps.setString(4, u.getQualification());
			ps.setInt(5, u.getId());
			
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
