package com.hiber.maping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int pid;
	
	@Column(name = "Project_name")
	private String pname;
	
	@ManyToMany(mappedBy = "projects")
	private List<EMP> employee;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<EMP> getEmployee() {
		return employee;
	}  

	public void setEmployee(List<EMP> employee) {
		this.employee = employee;
	}

	public Project(int pid, String pname, List<EMP> employee) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.employee = employee;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
