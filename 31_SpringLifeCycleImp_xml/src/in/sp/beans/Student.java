package in.sp.beans;

public class Student {
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
	// Implementing init() and destroy() methods manually
	// Name of the init() and destroy() can be anything, just we have to mention the same in xml file
	public void init() {
		System.out.println("Hii I am init()");
	}
	public void destroy() {
		System.out.println("Bye destroy()");
	}
	public void display() {
		System.out.println("Name :"+getName());
		System.out.println("RollNo :"+getRollno());
		System.out.println("Email :"+getEmail());
	}
}
