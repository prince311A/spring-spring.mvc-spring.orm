package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// for insertion
	@Transactional
	public int insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student); // this i holds the primary key not 0 or 1
		return i;
	}

	// get one row
	public Student getStudent(int studentId) {
		Student student = (Student) this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}

	// get all row
	public List<Student> getAllStudent() {
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}

	// delete row
	@Transactional
	public void deleteStudent(int StudentId) {
		Student student = this.hibernateTemplate.get(Student.class, StudentId);
		this.hibernateTemplate.delete(student);
	}
	// update row
	@Transactional
	public void updateStudent(int StudentId) {
		Student student = this.hibernateTemplate.get(Student.class, StudentId);
		student.setCity("Rewa");
		student.setStudentName("Piyush Chawla");
		this.hibernateTemplate.update(student);
	}
}
