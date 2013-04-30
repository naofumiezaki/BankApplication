package com.bank.Model;


import java.util.Set;
import org.hibernate.validator.constraints.NotEmpty;


public class Customer {
	private Integer customerno;

	
	@NotEmpty
	private String customerName;
	@NotEmpty(message="account number cannot be empty")
	private String city;
	@NotEmpty(message="account number cannot be empty")
	private String zip;
	@NotEmpty(message="account number cannot be empty")

	private String phone;
	
	private Set bankAccounts;
	
	public Customer(){}

	public Customer(String customerName, String city, String zip, String phone) {
		super();
		this.customerName = customerName;
		this.city = city;
		this.zip = zip;
		this.phone = phone;
	}

	public Customer(Integer customerno, String customerName, String city,
			String zip, String phone, Set bankAccounts) {
		super();
		this.customerno = customerno;
		this.customerName = customerName;
		this.city = city;
		this.zip = zip;
		this.phone = phone;
		this.bankAccounts = bankAccounts;
	}

	public Integer getCustomerno() {
		return customerno;
	}

	public void setCustomerno(Integer customerno) {
		this.customerno = customerno;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(Set bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
}
