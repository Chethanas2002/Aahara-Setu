package com.spring.aaharaSetu.model;

import java.util.List;

import jakarta.persistence.*;
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

	@Column(unique = true)
	private String reelUrl;

	private String reelCaption;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	@JoinColumn(name = "hotelId")
	private Hotel hotel;
	
	
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	@JoinTable(name = "user_reel",
	           joinColumns=@JoinColumn(name="reelId"),
	           inverseJoinColumns=@JoinColumn(name="userId")) 
	private List<User> users;

}
