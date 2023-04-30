package com.hiber.maping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapping_Demo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		
		EMP e1 = new EMP();
		EMP e2 = new EMP();
		
		e1.setEid(34);
		e1.setEname("Sushant");
		
		e2.setEid(36);
		e2.setEname("Prashant");
		
		Project project = new Project();
		Project project1 = new Project();
		
		project.setPid(122);
		project.setPname("Library Management Ssytem");

		project1.setPid(126);
		project1.setPname("Eccomerce");
		
		List<EMP> list1 = new ArrayList<EMP>();
		list1.add(e1);
		list1.add(e2);
		
		
		List<Project> projList = new ArrayList<Project>();
		projList.add(project);
		projList.add(project1);
		
		e1.setProjects(projList);
		
		project.setEmployee(list1);
		
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(project);
		session.save(project1);
		
		tx.commit();
		session.close();
		factory.close();
		
	}
}
