package in.sb.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sb.beans.Student;

public class Main {
	public static void main(String[] args) {
		String loc  ="/in/sb/resouces/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(loc);
		
	Student st1 =(Student)context.getBean("std1");
	st1.display();
	}
}
