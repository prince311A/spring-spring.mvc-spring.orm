package in.sb.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sb.beans.Students;

@Configuration
public class SpringConfigFile {
	@Bean
	public Students StdId1() {
		Students st = new Students();
		st.setName("Aman Tiwari");
		st.setRollno(01);
		st.setEmail("aman@gmail.com");
		return st;
	}
	// if we want name of the bean is different and method name is different than
	@Bean("StdId2")
	public Students name() {
		Students st = new Students();
		st.setName("Priya Tiwari");
		st.setRollno(02);
		st.setEmail("priya@gmail.com");
		return st;
	}
}
