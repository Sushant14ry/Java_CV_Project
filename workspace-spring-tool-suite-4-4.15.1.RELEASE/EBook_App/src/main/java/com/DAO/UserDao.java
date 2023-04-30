package com.DAO;

import com.Entity.User;

public interface UserDao {
	public boolean UserRegister(User us);
	
	public User Login(String email, String psw);
	
	public boolean CheckPassword(String psw, int id);
	
	public boolean UpdateProfile(User us);
	
	public boolean CheckUser(String em);
	
}
