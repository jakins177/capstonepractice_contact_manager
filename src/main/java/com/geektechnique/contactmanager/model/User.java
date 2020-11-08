package com.geektechnique.contactmanager.model;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	@NotBlank
	private String email;
	
	@NotBlank
	private String password;

	public User(@NotBlank @JsonProperty String email, @NotBlank @JsonProperty String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	


}
