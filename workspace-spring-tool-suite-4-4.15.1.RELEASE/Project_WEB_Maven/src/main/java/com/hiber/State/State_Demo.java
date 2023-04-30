package com.hiber.State;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiber.Project_WEB_Maven.Certificate;
import com.hiber.Project_WEB_Maven.Student;

public class State_Demo {

	public static void main(String[] args) {
		System.out.println("Example Done....");
		
		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		// Creating Student Object		
		Student st = new Student();
		st.setId(12);
		st.setName("Sushant Chaudhary");
		st.setCity("Kathmandu");
		st.setCerti(new Certificate("Java Programing","3 months"));
		// Student : Transient State
		
		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
		s.save(st);
		// Student : Persistent - Session, database
		st.setName("Prashant Chaudhary");
		
		tx.commit();
		s.close();
		st.setName("Alex");
		System.out.println(st);
		f.close();
	}
}
