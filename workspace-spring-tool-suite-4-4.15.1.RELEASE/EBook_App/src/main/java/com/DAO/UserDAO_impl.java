package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Entity.User;

public class UserDAO_impl implements UserDao {

	private Connection conn;

	public UserDAO_impl(Connection conn) {
		super();
		this.conn = conn;
	}

	/* Insert User */
	public boolean UserRegister(User us) {
		boolean f = false;

		try {
			String sql = "insert into user(name,email,phone,password) values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, us.getName());
			ps.setString(2, us.getEmail());
			ps.setString(3, us.getPhone());
			ps.setString(4, us.getPassword());

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public User Login(String email, String psw) {
		User usr = null;
		try {
			String login = "select * from user where email=? and password=? ";
			PreparedStatement ps = conn.prepareStatement(login);
			ps.setString(1, email);
			ps.setString(2, psw);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				usr = new User();
				usr.setId(rs.getInt(1));
				usr.setName(rs.getString(2));
				usr.setEmail(rs.getString(3));
				usr.setPhone(rs.getString(4));
				usr.setPassword(rs.getString(5));
				usr.setAddress(rs.getString(6));
				usr.setLandmark(rs.getString(7));
				usr.setCity(rs.getString(8));
				usr.setState(rs.getString(9));
				usr.setPincode(rs.getString(10));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return usr;
	}

	/* Check Password During Update Profile */
	public boolean CheckPassword(String psw, int id) {

		boolean f = false;
		try {
			String checkPsw = "select * from user where id=? and password=? ";
			PreparedStatement pst = conn.prepareStatement(checkPsw);
			pst.setInt(1, id);
			pst.setString(2, psw);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	/* Update Password During Update Profile */
	public boolean UpdateProfile(User us) {
		boolean f = false;

		try {
			String updProfile = "update user set name=?, email=?, phone=? where id=? ";
			PreparedStatement ps = conn.prepareStatement(updProfile);
			ps.setString(1, us.getName());
			ps.setString(2, us.getEmail());
			ps.setString(3, us.getPhone());
			ps.setInt(4, us.getId());

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	/* Check Email is Already Registered */
	public boolean CheckUser(String em) {
		boolean f = true;
		
		try {
			String Check_Email = "select * from user where email=? ";
			PreparedStatement ps = conn.prepareStatement(Check_Email);
			ps.setString(1, em);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				f = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}

}
