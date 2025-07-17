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
	@Query("SELECT c FROM City c" +
			"WHERE LOWER(c.cityName) = LOWER(:cityName)")
	List<City> findByCityNameExactMatch(String cityName);
	
//	Get city by name partial match and case-insensitive
	@Query("SELECT c FROM City c" +
			"WHERE LOWER(c.cityName) LIKE LOWER(CONCAT('%', :cityName, '%'))")
	List<City> findByCityNamePartialMatch(String cityName);
	

// TODO: Its better to query state id from the sate repo and then send the id to get all the cities.
//	Get cities based on specific state exact match and case-insensitive
	@Query("SELECT c FROM City c "+
	       "JOIN c.state s "+
		   "WHERE LOWER(s.stateName) = LOWER(:stateName)")
	List<City> searchCitiesByState(@Param("stateName") String stateName);
	

// TODO: Dont think this is useful !!
//	Get cities based on specific state exact match and case-insensitive
//	List<City> findByState_StateNameContainingIgnoreCase(String name);
	@Query("SELECT c FROM City c "+
			"JOIN c.state s "+
			"WHERE LOWER(s.stateName) LIKE LOWER(CONCAT('%',:stateName,'%'))")
	List<City> searchCitiesByStatePartialSearch(@Param("stateName") String stateName);
}

