package in.sb.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sb.beans.Student;
import in.sb.resources.SpringConfig;

public class Main {
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	Student st = (Student)context.getBean("std1");
	st.display();
}
}
