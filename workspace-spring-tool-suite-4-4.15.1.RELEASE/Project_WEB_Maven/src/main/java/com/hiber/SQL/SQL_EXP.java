package com.hiber.SQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.hiber.Project_WEB_Maven.Student;

public class SQL_EXP {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		
		// This is SQL Query
		String q = "select * from mystudents";
		NativeQuery nq = s.createSQLQuery(q);
		List<Object[]> list1 = nq.list();
		
		for(Object[] std : list1) {
			System.out.println(Arrays.deepToString(std));
			System.out.println("--------------------------");
			System.out.println(std[4]+" : "+std[3]);
		}
		
		
		
		s.close();
		factory.close();
	}
}
