package com.bank.Model;


import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class UsernamePassword {
	
	@NotEmpty
	private String username;
	
	@NotEmpty
	@Size(min = 5)
	private String password;
	@NotEmpty
	private String rePassword;
	
	public UsernamePassword(){}
	
	
	public UsernamePassword(String username) {
		super();
		this.username = username;
	}


	public UsernamePassword(String username, String password, String rePassword) {
		super();
		this.username = username;
		this.password = password;
		this.rePassword = rePassword;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRePassword() {
		return rePassword;
	}
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
}
