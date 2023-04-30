package com.hiber.Project_WEB_Maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch_Demo {

	public static void main(String[] args) {
		
//		Get and Load
		
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    
	    SessionFactory factory = cfg.buildSessionFactory();
	    Session session = factory.openSession();
	    // Get Student : 106
	    Student st = session.load(Student.class,106);
	    Student st1 = session.load(Student.class,106);
	    System.out.println(st);
	    System.out.println("Name : "+st.getName());
	    
	    Address ad = session.get(Address.class, 2);
	    System.out.println("City"+" : "+ad.getCity());
	    
	    
	    session.close();
	    factory.close();
		
	}
}
