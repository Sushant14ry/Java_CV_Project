package com.hiber.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Map_Demo {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		
//		Creating Question
		Question qsn = new Question();
		qsn.setQ_id(20);
		qsn.setQuestion("What is Java");
		
//		Creating Answer
		Answer ans = new Answer();
		ans.setAns_id(120);
		ans.setAnswer("Java is Programing language");
		ans.setQuestion(qsn);
		
//		Creating Answer
		Answer ans1 = new Answer();
		ans1.setAns_id(124);
		ans1.setAnswer("API to work with Objects in Java");
		ans1.setQuestion(qsn);
		
//		Creating Answer
		Answer ans2 = new Answer();
		ans2.setAns_id(125);
		ans2.setAnswer("Java has different Types of Framework");
		ans2.setQuestion(qsn);
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(ans);
		list.add(ans1);
		list.add(ans2);
		qsn.setAnswer(list);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
//		session.save(qsn);
//		session.save(ans);
//		session.save(ans1);
//		session.save(ans2);
		
//		Get specific Question and answer with Fetch Method
		Question q = (Question) session.get(Question.class, 20);
		System.out.println(q.getQ_id());
		System.out.println(q.getQuestion());
		System.out.println(q.getAnswer().size());
		
		tx.commit();
		
		// Fetching ............
		
//		Question newq =	session.get(Question.class, 20);
//		System.out.println(newq.getQuestion());
//		for(Answer a : newq.getAnswer()) {
//			System.out.println("  > "+a.getAnswer());
//		}
		session.close();
		factory.close();
		
	}
}
