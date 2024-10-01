package in.sb.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Students {
	@Value("Rahul Singh")
	private String name;
	@Value("02")
	private int rollno;
	@Value("rahul@gmail.com")
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
	
	public void display() {
		System.out.println("Name :"+getName());
		System.out.println("RollNo :"+getRollno());
		System.out.println("Email :"+getEmail());
	}

}
