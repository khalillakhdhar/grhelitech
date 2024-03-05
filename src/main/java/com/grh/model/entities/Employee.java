package com.grh.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Entity
@Data
public class Employee extends BaseEntity {
	@Column(nullable = false)
	
private String nom;
	@Column(nullable = false)
private String prenom;
	@Column(nullable = false,unique = true)
private String email;
	@Column(nullable = false)
private String password;
	@Enumerated(EnumType.STRING)
private Grade grade;
	private int age;
}
