package com.greatlearning.StudentManagementSecure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.greatlearning.StudentManagementSecure.entity.*;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByNameContainsAndCountryContainsAllIgnoreCase(String name, String country);

}
