package in.sb.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sb.beans.Address;
import in.sb.beans.Student;

@Configuration
public class SpringConfig {
	@Bean
	public Address adres() {
		Address address = new Address(33,"Vindhya Vihar","Rewa");
		return address;
	}
	@Bean
	public Student std1() {
		Student stdsStudent = new Student("Priya Singh",01,adres());
		return stdsStudent;
	}
}
