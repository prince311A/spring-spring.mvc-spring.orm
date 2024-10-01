package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/jdbc/config.xml");
       JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
       String insertString = "insert into student values(?,?,?)";
        
       int count = template.update(insertString,2,"Priya Tiwari","Rewa");
       if(count>0) {
    	   System.out.println("Successfully");
       }
       else {
    	   System.out.println("Unsucecssful");
       }
        
    }
}
