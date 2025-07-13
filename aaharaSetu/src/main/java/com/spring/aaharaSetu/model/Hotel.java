package com.spring.aaharaSetu.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany(mappedBy="hotel" , cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	private List<Reel> reel;

}
