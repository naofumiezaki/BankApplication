package com.bank.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


import com.bank.Model.Customer;
import com.bank.Model.UserPass;
import com.bank.Service.BankAccountService;
import com.bank.Service.UsernamePasswordService;

@Controller
public class LoginController {

	@Autowired
	private BankAccountService bankAccountService;

	@Autowired
	private UsernamePasswordService usernamepasswordservice;


	@RequestMapping(value="/welcome", method=RequestMethod.POST)
	public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session, HttpServletRequest request){


		List<Object> list = usernamepasswordservice.checkUsernamePassword(username);

		if(list.size() == 0){
			model.addAttribute("error", "invalid username or password");
			return "login";
		}

		UserPass u = (UserPass)list.get(0);
		String pass = u.getPassword();
		if(!pass.equals(password)){

			model.addAttribute("error", "invalid username or password");
			return "login";
		}
		Customer c1 =  (Customer)list.get(1);


		List<Object> ba =  bankAccountService.getBankAccount(c1.getCustomerno());

		request.setAttribute("BankList", ba);

		session.setAttribute("username", username);
		session.setAttribute("password", password);
		session.setAttribute("customer", c1);

		model.addAttribute(request);
		model.addAttribute("username", username);


		return "welcome";
	}

	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public String getContactInformation(Model model, HttpSession session, HttpServletRequest request){
		Customer c1 = (Customer)session.getAttribute("customer");


		model.addAttribute("customer", c1);
		return "contactInformation";
	}
}
