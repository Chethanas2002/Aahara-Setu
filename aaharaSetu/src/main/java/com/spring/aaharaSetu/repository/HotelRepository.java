package com.spring.aaharaSetu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.aaharaSetu.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>{
	
}
