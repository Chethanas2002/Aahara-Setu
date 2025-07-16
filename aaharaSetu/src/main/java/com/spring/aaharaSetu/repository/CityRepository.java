package com.spring.aaharaSetu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.aaharaSetu.model.City;


@Repository
public interface CityRepository extends JpaRepository<City, Long>{

//	Get city by name
	City findByCityName(String name);
	
//	Get city by name partial match and case insensitive 
	List<City> findByCityNameContainingIgnoreCase(String name);
	
//	Gets all the city ordered in ascending order of city name
	List<City> findAllByOrderByCityNameAsc();
	
//	Get cities based on specific state exact match and case insensitive
//	List<City> findByState_StateNameIgnoreCase(String name);
	@Query("SELECT c FROM City c "+
	       "JOIN c.state s "+
		   "WHERE LOWER(s.stateName) = LOWER(:stateName)")
	List<City> searchCitiesByState(@Param("stateName") String stateName);
	
	
//	Get cities based on specific state exact match and case insensitive
//	List<City> findByState_StateNameContainingIgnoreCase(String name);
	@Query("SELECT c FROM City c "+
			"JOIN c.state s "+
			"WHERE LOWER(s.stateName) LIKE LOWER(CONCAT('%',:stateName,'%'))")
	List<City> searchCitiesByStatePartialSearch(@Param("stateName") String stateName);
}

