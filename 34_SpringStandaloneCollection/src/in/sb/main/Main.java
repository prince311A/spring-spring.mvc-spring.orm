package in.sb.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sb.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/sb/resources/applicationContext.xml");
		Student st = (Student)context.getBean("std1");
		System.out.println(st);
		System.out.println(st.getSubjectList().getClass().getName());
		System.out.println(st.getFeesMap().getClass().getName());
		System.out.println("**************************************");
	}

}
