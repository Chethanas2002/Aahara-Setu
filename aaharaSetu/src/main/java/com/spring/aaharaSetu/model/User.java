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
public class User {
	
	@Id
	private long userId;

	@Column(unique = true)
	private String userName;
	
	@OneToOne(mappedBy="user" , cascade = CascadeType.ALL)
	private UserDetails userDetails;
	
	@ManyToMany(mappedBy = "users" , cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	private List<Reel> reels;

}
