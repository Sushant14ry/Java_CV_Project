package com.hiber.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiber.Project_WEB_Maven.Student;

public class HQL_EXP {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		// HQL
		// Syntax
		
		
//		Show all Student data from Database
//		String query = "from Student as s where s.city=:x and s.name=:n ";
		String query = "from Student ";
		Query q = s.createQuery(query);
//		q.setParameter("x", "Kathmandu");
//		q.setParameter("n", "Prashant Chaudhary");
		
		// Single Result -- ( Unique )
		// Multiple Result -- ( List )
		List<Student> list = q.list();
		
		for(Student stud : list) {
			System.out.println(stud.getName()+ " : "+stud.getCerti().getCourse());
		}
		
		System.out.println("------------------------------");
		
		
//		Delete Student from Database using HQL
		Transaction tx = s.beginTransaction();
		Query q2 = s.createQuery("delete from Student as s where s.city=:c ");
		q2.setParameter("c", "Bara");
		
		int r = q2.executeUpdate();
		System.out.println("Deleted : ");
		System.out.println(r);
		tx.commit();
		
//		Update Student from Database using HQL
		Transaction tx1 = s.beginTransaction();
		
		Query qu = s.createQuery("update Student as s set s.city=:c where s.name=:n ");
		qu.setParameter("c", "Bara");
		qu.setParameter("n", "Prashant Chaudhary");
		int r2 = qu.executeUpdate();
		System.out.println(r2+" Objects Updated");
		tx1.commit();
		
//		How to Execute Join Query
		Query q3 = s.createQuery("select q.question, q.q_id, a.answer from Question as q INNER JOIN q.answer as a");
		List<Object[]> list3 = q3.getResultList();
		
		for(Object[] arr: list3) {
			System.out.println(Arrays.toString(arr));
		}
		
		s.close();
		factory.close();
	}
}
