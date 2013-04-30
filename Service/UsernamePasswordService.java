package com.bank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DAO.UsernamePasswordDAOImpl;
import com.bank.Model.UserPass;
import com.bank.Model.UsernamePassword;

@Service
public class UsernamePasswordService {
	
	@Autowired
	UsernamePasswordDAOImpl up;
	
	public void addUsernamePassword(UserPass usernamepassword){
		up.addUsernamePassword(usernamepassword);
	}
	
	public List<Object> checkUsernamePassword(String username){
		return up.checkUsernamePassword(username);
		
	}
}
