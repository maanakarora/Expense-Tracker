package com.example.codewithmaanak.expense.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	private Long id;
	
	private String name;
	
	private String email;

}
