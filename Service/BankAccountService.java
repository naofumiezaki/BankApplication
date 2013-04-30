package com.bank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DAO.BankAccountDAOImpl;
import com.bank.Model.BankAccount;







@Service
public class BankAccountService {
	@Autowired
	private BankAccountDAOImpl bankAccountDAO;
	
	public void addBankAccount(BankAccount bankaccout){
		bankAccountDAO.addAccount(bankaccout);
	}
	

	
	public void deleteAccount(BankAccount bankaccout){
		bankAccountDAO.deleteAccount(bankaccout);
	}
	
	public void updateAccount(BankAccount bankaccout){
		bankAccountDAO.updateAccount(bankaccout);
	}
	
	public List selectAccount(){
		List list = bankAccountDAO.selectAccounts();
		
		return list;
	}
	
	
	
	public double getBalance_Account(String acctno){
		double balance = (Double)bankAccountDAO.getBalance_Available(acctno).get(0);
		
		return 0;
		
	}



	public List<Object> getBankAccount(Integer customerno) {
		return bankAccountDAO.getBankAccount(customerno);
	
	}
	
}
