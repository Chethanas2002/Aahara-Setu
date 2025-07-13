package com.spring.aaharaSetu.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reel {
	
	@Id
	private long reelId;
	private String reelUrl;
	private String reelCaption;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "hotelId")
	private Hotel hotel;

}
