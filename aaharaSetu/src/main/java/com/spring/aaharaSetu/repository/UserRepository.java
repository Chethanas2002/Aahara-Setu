package com.spring.aaharaSetu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.aaharaSetu.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
