package com.spring.jdbc1.dao;

import java.util.List;

import com.spring.jdbc1.entity.Student;
public interface StudentDao {
	public int insertion(Student student);
	public int updation(Student student);
	public int deletion(Student student);
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();
	
}
