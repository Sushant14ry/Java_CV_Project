package com.hiber.Pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hiber.Project_WEB_Maven.Student;

public class HQL_Pagination {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();

		Query<Student> query = s.createQuery("from Student");

		// implementing Pagination using Hibernate
		query.setFirstResult(4);
		query.setMaxResults(10);
		
		List<Student> list = query.list();
		
		for(Student st : list) {
			System.out.println(st.getId()+" : "+st.getName()+" : "+st.getCity());
		}
		
		s.close();
		factory.close();
	}
}
