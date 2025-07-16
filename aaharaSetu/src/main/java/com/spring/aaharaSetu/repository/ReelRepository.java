package com.spring.aaharaSetu.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.aaharaSetu.model.Reel;

@Repository
public interface ReelRepository extends JpaRepository<Reel, Long> {
	
	
//	Searches the reel by the caption Partial Match
	@Query("SELECT r FROM Reel r WHERE "+
	       "LOWER(r.reelCaption) LIKE LOWER(CONCAT('%',:captionKeyword,'%')")
	List<Reel> searchByReelCaption(@Param("captionKeyword") String captionKeyword);
	
	
//	Searches the reel by the url Partial Match
	@Query("SELECT r FROM Reel r WHERE "+
	       "LOWER(r.reelUrl) LIKE LOWER(CONCAT('%',:url , '%'))")
	Optional<Reel> searchByReelUrl(@Param("url") String url);
	
	
//	Searches the exact reel by the url 
	@Query("SELECT r FROM Reel r WHERE "+
			"LOWER(r.reelUrl) = LOWER(:url)")
	Optional<Reel> searchExactReelByUrl(@Param("url") String url);
	
	
//	Searches the reel by the user id exact match
	@Query("SELECT r FROM Reel r "+
	       "JOIN r.users u "+
		   "WHERE u.userId = :id")
	List<Reel> searchReelByUserId(@Param("id") long id);
	
	
//	Searches the reel by the user name Partial Match
	@Query("SELECT r FROM Reel r "+
		   "JOIN r.users u WHERE "+
		   "LOWER(u.userName) LIKE LOWER(CONCAT('%',:name,'%'))")
	List<Reel> searchReelByUserName(@Param("name") String name);
	
	
//	Searches the reel by the hotel name Partial Match
	@Query("SELECT r FROM Reel r "+
	       "JOIN r.hotel h "+
		   "WHERE LOWER(h.hotelName) LIKE LOWER(CONCAT('%',:name,'%'))")
	List<Reel> searchReelByHotelName(@Param("name") String name);
	
	
//	Searches the reel by the hotel id exact match
	@Query("SELECT r FROM Reel r "+
			"JOIN r.hotel h "+
			"WHERE h.hotelId = :id")
	List<Reel> searchReelByHotelId(@Param("id") int id);
}
