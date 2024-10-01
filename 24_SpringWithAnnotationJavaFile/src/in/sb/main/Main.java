package in.sb.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sb.beans.Students;
import in.sb.resources.SpringConfigFile;

public class Main {
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
	Students st1 =(Students) context.getBean("students");
	st1.display();
	// another way 
//		Students st1 = context.getBean(Students.class);
//		st1.display();
}
}
