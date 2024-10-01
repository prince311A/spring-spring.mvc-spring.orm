package com.spring.jdbc1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc1.dao.StudentDao;
import com.spring.jdbc1.dao.StudentDaoImpl;
import com.spring.jdbc1.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//   StudentDaoImpl daoImpl = (StudentDaoImpl) context.getBean("mydao"); // we have to create object of class and store in 
    // reference variable of Interface
    StudentDao dao = context.getBean("mydao",StudentDao.class);
   Student std1 = new Student();
   std1.setId(101);
   std1.setName("Rajbhan Soni");
   std1.setCity("Daulatpur");
   
//   int result = dao.insertion(std1);
   Student std2 = new Student();
   std2.setId(1);
   std2.setName("Varun Sood");
   std2.setCity("Mumbai");
//   int result = dao.updation(std2);
   
//   int result = dao.deletion(std2);
//   if(result>0) {
//	   System.out.println("Data Submitted Successfully");
//   }
//   else {
//	System.out.println("Something Went Wrong");
//}
   // Selecting for one row or single object
   Student std3 = dao.getStudent(2);
//   System.out.println(std3);
   List<Student>students = dao.getAllStudents();
   for(Student std: students) {
	   System.out.println(std);
   }
    }
}
