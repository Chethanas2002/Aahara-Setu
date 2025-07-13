package com.spring.aaharaSetu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Hotel {
	
	@Id
	private long hotelId;
	private String hotelName;
	private double latitude;
	private double longitude;
	private String zomatoLink;

}
