package com.hiber.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Person person = new Person(12,"Sushant","Kathmandu","9821224203");
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
	
		s.save(person);
		
		tx.commit();
		factory.close();
	}
}
