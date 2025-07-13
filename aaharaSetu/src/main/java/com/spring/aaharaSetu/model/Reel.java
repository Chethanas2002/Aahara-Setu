package com.spring.aaharaSetu.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
	
	
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	@JoinTable(name = "user_reel",
	           joinColumns=@JoinColumn(name="reelId"),
	           inverseJoinColumns=@JoinColumn(name="userId")) 
	private List<User> users;

}
