package in.sb.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sb.beans.Student;

public class Main {
	public static void main(String[] args) {
		String loc = "/in/sb/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(loc);
		Student st =(Student) context.getBean("StdID2");
		st.display();
	}

}
