package in.sb.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import in.sb.beans.Address;
import in.sb.beans.Student;
import in.sb.beans.Subject;

@Configuration
public class SpringConfig {
	@Bean
	public Address adres() {
		Address address = new Address();
		address.setHouseNo(33);
		address.setLandmark("Vindhya Vihar");
		address.setCity("Rewa");
		return address;
	}
	@Bean
	public Address adres2() {
		Address address = new Address();
		address.setHouseNo(34);
		address.setLandmark("Santi Vihar");
		address.setCity("Satna");
		return address;
	}
	
	@Bean
	public Subject subj() {
		Subject subject = new Subject();
		List<String> list = new ArrayList<>();
		list.add("JAVA");
		list.add("Python");
		list.add("C++");
		subject.setList(list);
		return subject;
	}
	@Bean
	public Student std1() {
		Student stdsStudent = new Student();
		stdsStudent.setName("Priya Singh");
//		stdsStudent.setAddress(adres());// Manually Injection
//		stdsStudent.setSubject(subj());// Manually Injection
		stdsStudent.setRollno(01);
		return stdsStudent;
	}
}
