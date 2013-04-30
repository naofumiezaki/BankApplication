package com.bank.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DAO.CustomerDAOImpl;
import com.bank.Model.Customer;




@Service
public class CustomerService {
	@Autowired
	private CustomerDAOImpl customerDAO;
	
	public void addCustomer(Customer Customer){
		customerDAO.addCustomer(Customer);
	}
	
	
}

