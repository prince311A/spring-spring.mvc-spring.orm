package in.sb.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		String config_loc = "/in/sb/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student std =(Student)context.getBean("StdID1");
		std.display();
		System.out.println("-------------------------------------");
		Student std1 =(Student)context.getBean("StdID2");
		std1.display();
	}
	/*Adding All Jar Files
	 * spring-beans-xxx.jar
	 * spring-core-xxx.jar
	 * spring-context-xxx.jar
	 * spring-expression-xxx.jar
	 * commons-logging-xxx.jar
	 * */
}
