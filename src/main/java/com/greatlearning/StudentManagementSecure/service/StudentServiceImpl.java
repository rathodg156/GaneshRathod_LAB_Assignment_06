package com.greatlearning.StudentManagementSecure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.StudentManagementSecure.entity.Student;
import com.greatlearning.StudentManagementSecure.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public Student findById(int theId) {
		Student student = studentRepository.findById(theId).get();
		return student;
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void deleteById(int theId) {
		studentRepository.deleteById(theId);

	}

	@Override
	public List<Student> searchBy(String name, String country) {
		List<Student> students = studentRepository.findByNameContainsAndCountryContainsAllIgnoreCase(name, country);
		return students;
	}

}
