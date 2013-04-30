package com.bank.Model;

public class UserPass {
	private String username;
	private String password;
	private Customer customer;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public UserPass(){}
	public UserPass(String username, String password, Customer customer) {
		super();
		this.username = username;
		this.password = password;
		this.customer = customer;
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
}
