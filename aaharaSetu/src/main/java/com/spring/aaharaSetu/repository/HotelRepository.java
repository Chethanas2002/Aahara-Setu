package com.spring.aaharaSetu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.aaharaSetu.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{
	
	
// Search by hotel name partial match
	@Query("SELECT h FROM Hotel h WHERE " +
	       "LOWER(h.hotelName) LIKE LOWER(CONCAT('%' , :keyword , '%'))")
	List<Hotel> searchByHotelName(@Param("keyword") String keyword);
	
	
// Search by hotel name partial match
	@Query("SELECT h FROM Hotel h WHERE " +
			"LOWER(h.hotelName) = LOWER(:keyword)")
	List<Hotel> searchByHotelNameExactMatch(@Param("keyword") String keyword);
	
	
// Search by latitude and longitude exact match
	@Query("SELECT h FROM Hotel h WHERE "+
           "h.latitude = :latitude AND "+
		   "h.longitude = :longitude")
	List<Hotel> searchHotelByLatitudeAndLongitude(@Param("latitude") double latitude ,
			                                    @Param("longitude") double longitude);
	
	
//	Getting all the hotels in a specific city by city id
	@Query("SELECT h FROM Hotel h "+
           "JOIN h.city c WHERE c.cityId = :id")
	List<Hotel> getHotelsByCityId(@Param("id") long id);
	
	
//	Getting all the hotels in a specific city by city name exact match
	@Query("SELECT h FROM Hotel h "+
		   "JOIN h.city c WHERE "+
		   "LOWER(c.cityName) = LOWER(:name)")
	List<Hotel> getHotelsByCityName(@Param("name") String name);
	
	
//	Getting hotel by city id and order the hotel by name
	List<Hotel> findByCity_CityIdOrderByHotelNameAsc(long id);
	
//	Getting hotel by city name and order the hotel by name
	List<Hotel> findByCity_CityNameOrderByHotelNameAsc(String name);

//	Get hotels from reel id
	List<Hotel> findByReel_ReelId(long id);
	
	
//	Search hotel by hotel name and city name
//	List<Hotel> findByCity_CityNameAndHotelNameContainingIgnoreCase(String cityName, String name);

	@Query("SELECT h FROM Hotel h "+
           "JOIN h.city c "+
		   "WHERE LOWER(c.cityName)=LOWER(:cityName) "+
           "AND LOWER(h.hotelName)=LOWER(:hotelName)")
	List<Hotel> searchHotelByNameAndCity(@Param("hotelName") String hotelName,
			                             @Param("cityName") String cityName);
	
}

