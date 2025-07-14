package com.spring.aaharaSetu.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserDetails {
	
	@Id
	private long userDetailsId;

	private String firstName;
	private String lastName;
	private String address;

	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private long phone;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private User user;
	

}
