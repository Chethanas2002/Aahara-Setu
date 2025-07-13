package com.spring.aaharaSetu.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
	private String userName;
	
	@OneToOne(mappedBy="user" , cascade = CascadeType.ALL)
	private UserDetails userDeatils;

}
