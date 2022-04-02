package com.greatlearning.StudentManagementSecure.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.StudentManagementSecure.entity.Student;

@Service
public interface StudentService {

	public Student findById(int theId);

	public List<Student> findAll();

	public void save(Student student);

	public void deleteById(int theId);

	public List<Student> searchBy(String name, String country);

}
