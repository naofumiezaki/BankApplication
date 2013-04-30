package com.bank.Model;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;


public class BankAccount {

	private Integer acctno;
	@NotEmpty
	private String acct_type;
	@Range(min = 100,message="account balance should be minimum 100")
	private double balance_available;

	private Customer customer;

	public BankAccount(){}
	public BankAccount(Integer acctno, String acct_type,
			double balance_available, Customer customer) {
		super();
		this.acctno = acctno;
		this.acct_type = acct_type;
		this.balance_available = balance_available;
		this.customer = customer;
	}
	public Integer getAcctno() {
		return acctno;
	}
	public void setAcctno(Integer acctno) {
		this.acctno = acctno;
	}
	public String getAcct_type() {
		return acct_type;
	}
	public void setAcct_type(String acct_type) {
		this.acct_type = acct_type;
	}
	public double getBalance_available() {
		return balance_available;
	}
	public void setBalance_available(double balance_available) {
		this.balance_available = balance_available;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
