package in.sp.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student {
	private String name;
	private int rollno;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	// Implementing init() and destroy() methods manually using interface
	@PostConstruct
	public void init(){
		System.out.println("Hii I am init()");
		
	}
	@PreDestroy
	public void destroy() {
	System.out.println("Hii I am distroy");	
	}
	public void display() {
		System.out.println("Name :"+getName());
		System.out.println("RollNo :"+getRollno());
		System.out.println("Email :"+getEmail());
	}

}
