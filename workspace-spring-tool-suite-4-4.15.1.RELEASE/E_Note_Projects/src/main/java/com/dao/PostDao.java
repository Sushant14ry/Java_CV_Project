package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Post;
import com.entity.User;

public class PostDao {

	private Connection conn;

	public PostDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	/* Add New Post */
	public boolean AddNotes(String ti, String co, int ui) {
		boolean f = false;

		try {
			String query = "insert into post(p_title,p_content,uid) values(?,?,?)";

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, ti);
			ps.setString(2, co);
			ps.setInt(3, ui);

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {

		}

		return f;
	}
	
	/* Show Particular User All Post */
	public List<Post> getAll_PostContent(int pid) {
		List<Post> list = new ArrayList<Post>();
		Post posts = null;
		try {

			String show_post = "select * from post where uid=? order by p_id DESC";
			PreparedStatement pstm = conn.prepareStatement(show_post);
			pstm.setInt(1, pid);

			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				posts = new Post();
				posts.setP_id(rs.getInt("p_id"));
				posts.setP_title(rs.getString("p_title"));
				posts.setP_content(rs.getString("p_content"));
				posts.setP_date(rs.getTimestamp("p_date"));

				list.add(posts);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
	/* Find Post By Id */
	public Post getPost_DataById(int post_id)
	{
		Post pst = null;
		try {
			String sql = "select * from post where p_id=?";
			
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, post_id);
			
			ResultSet rs = pstm.executeQuery();
			if(rs.next()) {
				pst = new Post();
				pst.setP_id(rs.getInt(1));
				pst.setP_title(rs.getString(2));
				pst.setP_content(rs.getString(3));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return pst;
	}

	/* Update Particular User Post */
	public boolean PostUpdate(int pid, String p_tit, String p_con )
	{
		boolean f = false;
		try {
			
			String upd = "update post set p_title=?, p_content=? where p_id=? ";
			
			PreparedStatement pstm = conn.prepareStatement(upd);
			pstm.setString(1, p_tit);
			pstm.setString(2, p_con);
			pstm.setInt(3, pid);
			
			int i = pstm.executeUpdate();
			if(i==1)
			{
				f = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	/* Delete Particular User Post */
	
	public boolean DeletePost(int nid)
	{
		boolean f = false;
		
		try {
			String Del_note = "delete from post where p_id=?";
			
			PreparedStatement pstm = conn.prepareStatement(Del_note);
			pstm.setInt(1, nid);
			
			int i = pstm.executeUpdate();
			if(i == 1)
			{
				f = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
}
