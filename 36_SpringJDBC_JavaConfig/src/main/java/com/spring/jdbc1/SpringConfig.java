package com.spring.jdbc1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc1.dao.StudentDaoImpl;

@Configuration
public class SpringConfig {
	@Bean
	public DriverManagerDataSource myDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("prince311@A");
		return dataSource;
	}
	@Bean
	public JdbcTemplate template() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(myDataSource());
		return template;
	}
	@Bean("mydao")
	public StudentDaoImpl myDao() {
		StudentDaoImpl dao = new StudentDaoImpl();
		dao.setTemplate(template());
		return dao;
	}
}
