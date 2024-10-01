package in.sb.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sb.beans.Address;
import in.sb.beans.Student;

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
	public Student std1() {
		Student stdsStudent = new Student();
		stdsStudent.setName("Priya Singh");
		stdsStudent.setAddress(adres());
		stdsStudent.setRollno(01);
		return stdsStudent;
	}
}
