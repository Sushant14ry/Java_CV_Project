package com.hiber.maping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class EMP {

	@Id
	private int eid;
	
	@Column(name = "Emp_Name")
	private String ename;
	
	@ManyToMany
	@JoinTable
	(
		name = "Emp_Learn", 
		joinColumns = {@JoinColumn(name="emp_id")},
		inverseJoinColumns = {@JoinColumn(name="proj_id")}
	)
	private List<Project> projects;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public EMP(int eid, String ename, List<Project> projects) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.projects = projects;
	}

	public EMP() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
