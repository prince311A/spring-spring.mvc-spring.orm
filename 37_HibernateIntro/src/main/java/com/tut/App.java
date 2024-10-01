package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Project Started!");
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		// creating student
		Student st1 = new Student();
//       st1.setId(101); // NO NEED BECUSE ID IS PRIMARY AND AUTO INCREMENT
		st1.setName("Saurabh Gupta");
		st1.setCity("Rewa");

		Address address1 = new Address();
		address1.setStreet("street1");
		address1.setCity("Mumbai");
		address1.setOpen(true);
		address1.setX(55.023);
		address1.setAddedDate(new Date());
		// reading image
		FileInputStream fis = new FileInputStream("src/main/java/mypic.jpg");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		address1.setImage(data);

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		// For Insertion
		try {
			session.save(st1); // saving student object
//			session.save(address1); // saving address object
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
			e.printStackTrace();
		}

		session.close();

	}
}
