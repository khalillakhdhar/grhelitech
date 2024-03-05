package com.grh.model.dto;

import com.grh.model.entities.Grade;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record EmployeeDTO(
		@NotBlank
		String nom,
		@NotBlank
		String prenom,
		@Email
		@NotBlank(message = "l'email ne doit pas être vide")
		//@NotNull
		String email,
		@NotBlank
		String password,
		
		Grade grade,
		@Min(value = 18)
		int age
		) {

}
