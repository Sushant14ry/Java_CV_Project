package com.hiber.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hiber.Project_WEB_Maven.Student;

public class Criteria_exp {

	public static void main(String[] args) {
		
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Criteria c = s.createCriteria(Student.class);
		
//		c.add(Restrictions.eq("certi.course", "Go"));
		c.add(Restrictions.like("certi.course", "%j%"));
		
		List<Student> students = c.list();
		
		for(Student st : students) {
			
			System.out.println(st);
		}
	}
}
