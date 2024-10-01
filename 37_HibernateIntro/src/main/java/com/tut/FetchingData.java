package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchingData {
	public static void main(String[] args) {
		SessionFactory sessionFactory  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		// fetch the data 
		// get vs load --> get return null when empty, load throws exception when empty
		Student student = session.get(Student.class, 3); // pass class and id
		System.out.println(student);
	}
}
