package com.hiber.Cascade;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hiber.Project_WEB_Maven.Student;

public class Second_level_cache {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Student student1 = s.get(Student.class, 4);
		System.out.println(student1);
		
//		s.close();
		
		Session s2 = factory.openSession();
		Student student2 = s.get(Student.class, 4);
		System.out.println(student2);
		
		s2.close();
		factory.close();
	}
}
