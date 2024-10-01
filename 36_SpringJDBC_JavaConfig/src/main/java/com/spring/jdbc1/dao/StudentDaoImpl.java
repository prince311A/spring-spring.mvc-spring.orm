package com.spring.jdbc1.dao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc1.entity.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate template;
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int insertion(Student student) {
		String queryString  = "insert into student values(?,?,?)";
		int count = template.update(queryString,student.getId(),student.getName(),student.getCity());
		return count;
	}

	public int updation(Student student) {
		String queryString  = "update student set name =?, city =? where id =? ";
		int count = template.update(queryString,student.getName(),student.getCity(),student.getId());
		return count;
	}

	public int deletion(Student student) {
		String queryString  = "delete from student where id =? ";
		int count = template.update(queryString,student.getId());
		return count;
	}

	public Student getStudent(int studentId) {
		Student student = new Student();
		String sqlString = "select * from student where id = ?";
		RowMapper<Student>rowMapper = new MyRowMapper();
	    student =	template.queryForObject(sqlString, rowMapper, studentId);
		return student;
	}

	public List<Student> getAllStudents() {
		String sqlString = "select * from student";
		RowMapper<Student>rowMapper = new MyRowMapper();
	    List<Student> students = template.query(sqlString, rowMapper);
	    return students;
	}
	
	
	
	
}
