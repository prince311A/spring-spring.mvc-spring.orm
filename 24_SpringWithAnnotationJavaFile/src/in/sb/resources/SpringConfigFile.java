package in.sb.resources;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.sb.beans")
//@ComponentScan({"in.sb.beans"}) another way in case of more than 1 package
public class SpringConfigFile {
	}
