package in.sb.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sb.beans.Students;

public class Main {
	public static void main(String[] args) {
		String loc = "/in/sb/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(loc);
		
	Students std =	(Students)context.getBean("students");
	std.display();
	}
}
