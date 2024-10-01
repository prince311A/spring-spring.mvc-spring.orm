package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao dao = context.getBean("studentdao", StudentDao.class);

		Student student = new Student();
		student.setStudentId(101);
		student.setStudentName("Gajjumal Singh");
		student.setCity("Guna Cave");

		Student student1 = new Student();
		student1.setStudentId(102);
		student1.setStudentName("Rahul Dev");
		student1.setCity("Kannuajj");

		// For insertion
//		int x = dao.insert(student);
//		int y = dao.insert(student1);
//		if (x > 0)
//			System.out.println("Data Inserted Successfully of Student");
//		else
//			System.out.println("Something went Wrong of Student");
//
//		if (y > 0)
//			System.out.println("Data Inserted Successfully of Student1");
//		else
//			System.out.println("Something went Wrong of Student1");
		
		// For Getting one row
//		Student student2 = dao.getStudent(102);
//		System.out.println(student2);
		
		// For Getting all rows
//		List<Student> list = dao.getAllStudent();
//		System.out.println(list);
		
		// For Deletion
//		dao.deleteStudent(102);
//		System.out.println("Student Delete Successfully");
		
		// For Update
		dao.updateStudent(101);
		System.out.println("Details Updated Successfully");
		
		
		
		
		
		
		
	}
}
