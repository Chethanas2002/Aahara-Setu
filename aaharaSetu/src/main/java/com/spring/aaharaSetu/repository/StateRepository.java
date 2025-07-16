package com.spring.aaharaSetu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.aaharaSetu.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{
	
//	searching state by name
	List<State> findByStateName(String name);
	
//	searching state by name partial matching
	List<State> findByStateNameContainingIgnoreCase(String name);
	
//	get all the states ordered in ascending order of their name
	List<State> findAllByOrderByStateNameAsc();
	


}
