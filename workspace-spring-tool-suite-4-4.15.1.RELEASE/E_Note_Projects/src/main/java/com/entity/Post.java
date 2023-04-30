package com.entity;

import java.util.Date;

public class Post {

	private int p_id;
	private String p_title;
	private String p_content;
	private Date p_date;
	private User user;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_title() {
		return p_title;
	}
	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	public String getP_content() {
		return p_content;
	}
	public void setP_content(String p_content) {
		this.p_content = p_content;
	}
	public Date getP_date() {
		return p_date;
	}
	public void setP_date(Date p_date) {
		this.p_date = p_date;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Post(int p_id, String p_title, String p_content, Date p_date, User user) {
		super();
		this.p_id = p_id;
		this.p_title = p_title;
		this.p_content = p_content;
		this.p_date = p_date;
		this.user = user;
	}
	
	
	
}
