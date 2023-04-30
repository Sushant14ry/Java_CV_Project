package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Jobs;

public class Job_DAO {

	private Connection conn;

	public Job_DAO(Connection conn) {
		super();
		this.conn = conn;
	}
	
	/* User Add Jobs in Database */
	public boolean Add_Jobs(Jobs jb) {
		
		boolean f = false;
		try {
			String addJobs ="insert into jobs(title,description,category,status,location) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(addJobs);
			pst.setString(1, jb.getTitle());
			pst.setString(2, jb.getDescription());
			pst.setString(3, jb.getCategory());
			pst.setString(4, jb.getStatus());
			pst.setString(5, jb.getLocation());
			
			int i = pst.executeUpdate();
			if(i == 1) {
				f = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	/* Fetch and Show all Jobs from Database */
	public List<Jobs> getAllJobs()
	{
		List<Jobs> list = new ArrayList<Jobs>();
		Jobs j = null;
		try {
			
			String showAllJobs = "select * from jobs ORDER by id DESC";
			PreparedStatement ps = conn.prepareStatement(showAllJobs);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				j = new Jobs();
				j.setId(rs.getInt(1));
				j.setTitle(rs.getString(2));
				j.setDescription(rs.getString(3));
				j.setCategory(rs.getString(4));
				j.setStatus(rs.getString(5));
				j.setLocation(rs.getString(6));
				j.setPdate(rs.getTimestamp(7)+"");
				list.add(j);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	/* Find Job Post by Id from Database */
	public Jobs getJobById(int id)
	{
		Jobs j = null;
		try {
			
			String showAllJobs = "select * from jobs where id=? ";
			PreparedStatement ps = conn.prepareStatement(showAllJobs);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				j = new Jobs();
				j.setId(rs.getInt(1));
				j.setTitle(rs.getString(2));
				j.setDescription(rs.getString(3));
				j.setCategory(rs.getString(4));
				j.setStatus(rs.getString(5));
				j.setLocation(rs.getString(6)); 
				j.setPdate(rs.getTimestamp(7)+"");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;	
	}
	
	/* Update User Job Posts */
	public boolean UpdateJobPost(Jobs jb) {
		
		boolean f = false;
		try {
			String addJobs ="update jobs set title=?, description=?, category=?, status=?, location=? where id=? ";
			PreparedStatement pst = conn.prepareStatement(addJobs);
			pst.setString(1, jb.getTitle());
			pst.setString(2, jb.getDescription());
			pst.setString(3, jb.getCategory());
			pst.setString(4, jb.getStatus());
			pst.setString(5, jb.getLocation());
			pst.setInt(6, jb.getId());
			
			int i = pst.executeUpdate();
			if(i == 1) {
				f = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	/* Delete User Job Posts */
	public boolean DeleteJobPost(int id) {
		boolean f = false;
		try {
			String delpost = "delete from jobs where id=? ";
			PreparedStatement ps = conn.prepareStatement(delpost);
			ps.setInt(1, id);
			
			int i = ps.executeUpdate();
			if(i == 1) {
				f = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return f;
	}
	
	/* Show all Active Job Posts */
	public List<Jobs> getAllActiveJobsForUsers(){
		
		List<Jobs> list = new ArrayList<Jobs>();
		Jobs j = null;
		try {
			
			String showAllJobs = "select * from jobs where status=? ORDER by id DESC";
			PreparedStatement ps = conn.prepareStatement(showAllJobs);
			ps.setString(1, "Active");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				j = new Jobs();
				j.setId(rs.getInt(1));
				j.setTitle(rs.getString(2));
				j.setDescription(rs.getString(3));
				j.setCategory(rs.getString(4));
				j.setStatus(rs.getString(5));
				j.setLocation(rs.getString(6));
				j.setPdate(rs.getTimestamp(7)+"");
				list.add(j);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	/* Show all Active Job With Location OR Category Posts */
	public List<Jobs> getJob_locationORCat(String category, String location){
		
		List<Jobs> list = new ArrayList<Jobs>();
		Jobs j = null;
		try {
			
			String showAllJobs = "select * from jobs where category=? or location=? and status=? ORDER by id DESC";
			PreparedStatement ps = conn.prepareStatement(showAllJobs);
			ps.setString(1, category);
			ps.setString(2, location);
			ps.setString(3, "Active");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				j = new Jobs();
				j.setId(rs.getInt(1));
				j.setTitle(rs.getString(2));
				j.setDescription(rs.getString(3));
				j.setCategory(rs.getString(4));
				j.setStatus(rs.getString(5));
				j.setLocation(rs.getString(6));
				j.setPdate(rs.getTimestamp(7)+"");
				list.add(j);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;	
	}
	
	/* Show all Active Job With Location OR Category Posts */
	public List<Jobs> getJob_locationOAndCat(String category, String location){
		
		List<Jobs> list = new ArrayList<Jobs>();
		Jobs j = null;
		try {
			
			String showAllJobs = "select * from jobs where category=? and location=? and status=? ORDER by id DESC";
			PreparedStatement ps = conn.prepareStatement(showAllJobs);
			ps.setString(1, category);
			ps.setString(2, location);
			ps.setString(3, "Active");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				j = new Jobs();
				j.setId(rs.getInt(1));
				j.setTitle(rs.getString(2));
				j.setDescription(rs.getString(3));
				j.setCategory(rs.getString(4));
				j.setStatus(rs.getString(5));
				j.setLocation(rs.getString(6));
				j.setPdate(rs.getTimestamp(7)+"");
				list.add(j);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;	
	}
	
	/* Show all Active Search Job Posts */
	public List<Jobs> Search_Active_JobsWithLoc_Cat(String location, String category){
		
		List<Jobs> list = new ArrayList<Jobs>();
		Jobs j = null;
		try {
			
			String SearchJobs = "select * from jobs where location like ? OR category like ? and status=?  ORDER by id DESC";
			PreparedStatement ps = conn.prepareStatement(SearchJobs);
			ps.setString(1, "%"+location+"%");
			ps.setString(2, "%"+category+"%");	
			ps.setString(3, "Active");

			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				j = new Jobs();
				j.setId(rs.getInt(1));
				j.setTitle(rs.getString(2));
				j.setDescription(rs.getString(3));
				j.setCategory(rs.getString(4));
				j.setStatus(rs.getString(5));
				j.setLocation(rs.getString(6));
				j.setPdate(rs.getTimestamp(7)+"");
				list.add(j);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	
	
}
