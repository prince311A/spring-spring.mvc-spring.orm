package in.sp.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean {
	private String name;
	private int rollno;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting Property");
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
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hii I am InitializingBean");
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
	System.out.println("Hii I am DisposibleBean");	
	}
	public void display() {
		System.out.println("Name :"+getName());
		System.out.println("RollNo :"+getRollno());
		System.out.println("Email :"+getEmail());
	}

}
