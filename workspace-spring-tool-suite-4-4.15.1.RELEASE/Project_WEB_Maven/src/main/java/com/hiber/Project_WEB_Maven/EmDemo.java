package com.hiber.Project_WEB_Maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		
		Student stud1 = new Student();
		stud1.setId(323);
		stud1.setName("Alex");
		stud1.setCity("Hetauda");
		
		Student stud2 = new Student();
		stud2.setId(3232);
		stud2.setName("Kshitize");
		stud2.setCity("Kolvi");
		
		
		Certificate certi = new Certificate();
		certi.setCourse("java");
		certi.setDuration("3 Months");
		
		stud1.setCerti(certi);
		
		Certificate certi2 = new Certificate();
		certi2.setCourse("Diploma");
		certi2.setDuration("6 Months");
		
		stud2.setCerti(certi2);

		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
//		Save Objects 
		
		session.save(stud1);
		session.save(stud2);
		
		tx.commit();
		session.close();
		factory.close();

	}
}
