package com.greatlearning.studentMgmt.service;

import java.util.List;

import com.greatlearning.studentMgmt.model.Student;

public interface StudentService {
	public List<Student> getAllStudents();
	public void save(Student student);
	public Student delete(int id);
	public Student getStudentById(int id);
}
