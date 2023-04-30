package com.hiber.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hiber.Project_WEB_Maven.Student;

public class First_level_Cache {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();

		Student std = s.get(Student.class, 4);
		System.out.println(std);
		System.out.println("Working Something");

		Student std1 = s.get(Student.class, 4);
		System.out.println(std1);
		System.out.println("Working Something");

		System.out.println("---------------");

		System.out.println(s.contains(std1));
		s.close();
		System.out.println("---------------");

//		System.out.println(s.contains(std1));
		factory.close();
	}
}
