package in.sb.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		String config_loc = "/in/sb/resources/applicationContext.xml";
//		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		// To call destroy() we have to create bean object using AbstractApplicationConext
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		Student std =(Student)context.getBean("StdID1");
		std.display();
		context.registerShutdownHook(); // this call destroy()
	}
	/*Adding All Jar Files
	 * spring-beans-xxx.jar
	 * spring-core-xxx.jar
	 * spring-context-xxx.jar
	 * spring-expression-xxx.jar
	 * commons-logging-xxx.jar
	 * */
}
