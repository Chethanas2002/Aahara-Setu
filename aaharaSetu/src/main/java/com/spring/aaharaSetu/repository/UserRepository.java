package com.spring.aaharaSetu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.aaharaSetu.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
	@Query("SELECT u FROM User u WHERE " +
	       "LOWER(u.userName) LIKE LOWER(CONCAT('%', :keyword , '%'))")
	User searchUserByName(@Param("keyword") String keyword);

}
