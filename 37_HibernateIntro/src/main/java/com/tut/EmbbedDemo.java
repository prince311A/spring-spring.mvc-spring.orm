package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbbedDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Student st1 = new Student();
		st1.setName("Vandana Sahu");
		st1.setCity("Gurgaon");
		
		Certificate certificate = new Certificate();
		certificate.setCourse("Java Full Stack");
		certificate.setDuration("4 Months");
		
		st1.setCertify(certificate);
		
		Session session = sessionFactory.openSession();
		Transaction txTransaction = session.beginTransaction();
		
		session.save(st1);
		txTransaction.commit();

		sessionFactory.close();
	}

}
