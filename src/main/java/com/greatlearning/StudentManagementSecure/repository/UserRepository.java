package com.greatlearning.StudentManagementSecure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.greatlearning.StudentManagementSecure.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	// JQL JPA QUERY LANGUAGE
	@Query("select u from User u where u.username= ?1")
	public User getUserByUserName(String username);

}
