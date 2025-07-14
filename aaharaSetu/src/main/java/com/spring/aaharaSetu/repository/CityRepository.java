package com.spring.aaharaSetu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.aaharaSetu.model.City;


@Repository
public interface CityRepository extends JpaRepository<City, Integer>{

}
