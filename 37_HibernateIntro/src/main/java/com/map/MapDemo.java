package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Question q1 = new Question();
		q1.setQuestionId(101);
		q1.setQuestion("What is Java ?");
		
		Answer a1 = new Answer();
		a1.setAnswerId(1101);
		a1.setAnswer("Java is Programming Language");
		
		
		q1.setAnswer(a1);
		a1.setQuestion(q1);
		
		
		Session session = sessionFactory.openSession();
		Transaction txTransaction = session.beginTransaction();
		
		session.save(q1);
		session.save(a1);
		
		txTransaction.commit();
		session.close();
	}

}
