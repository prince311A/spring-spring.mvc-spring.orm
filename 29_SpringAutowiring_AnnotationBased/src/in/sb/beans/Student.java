package in.sb.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String name;
	private int rollno;
	@Autowired
	@Qualifier("adres2")
	private Address address;
	
	@Autowired
	private Subject subject;
	
	public void setName(String name) {
		this.name = name;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


    public void display() {
		System.out.println("Name :"+name);
		System.out.println("Roll No. :"+rollno);
		System.out.println("Address :"+address);
		System.out.println("Subject :"+subject);
	}

}
