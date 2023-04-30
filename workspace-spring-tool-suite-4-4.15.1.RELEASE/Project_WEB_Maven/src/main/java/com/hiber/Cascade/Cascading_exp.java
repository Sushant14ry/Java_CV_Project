package com.hiber.Cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiber.map.Answer;
import com.hiber.map.Question;

public class Cascading_exp {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		
		Question q1 = new Question();
		q1.setQ_id(13461);
		q1.setQuestion("What is ABC....");
		
		Answer a1 =	new Answer(2133, "Hibernates is important Concept", q1);
		Answer a2 =	new Answer(234, "Hibernates Second Concept", q1);
		Answer a3 =	new Answer(225, "Hibernates Third Concept", q1);

		List<Answer> list = new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q1.setAnswer(list);
		
		Transaction tx = s.beginTransaction();
		
		s.save(q1);
		s.save(a1);
		s.save(a2);
		s.save(a3);
		
		
		tx.commit();
		s.close();
		factory.close();
	}
}
