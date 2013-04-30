package com.bank.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.bank.Model.BankAccount;
import com.bank.Model.Customer;
import com.bank.Model.UserPass;
import com.bank.Model.UsernamePassword;
import com.bank.Service.BankAccountService;
import com.bank.Service.CustomerService;
import com.bank.Service.UsernamePasswordService;
import com.bank.Validator.PasswordValidator;

@Controller
public class WelcomeController {
	
	@Autowired
	BankAccountService bankAccountService;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	UsernamePasswordService usernamepasswordservice;

	private Customer c1;
	private UsernamePassword up1;	
	

	

	@RequestMapping(value="/w", method=RequestMethod.GET)
	public String welcomepage(Model model, HttpSession session){
		return "login";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView requestLogin(HttpServletRequest request){
		
		return new ModelAndView("login");
	}

	@RequestMapping(value="/createnewaccount", method=RequestMethod.GET)
	public ModelAndView requestCreateNewAccount(HttpServletRequest request, HttpSession session){
		ModelAndView mav= new ModelAndView("newCustomer");
		
		
		mav.addObject("c1", new Customer());
		
		return mav;
	}

	@RequestMapping(value="/createUsernamePassword", method=RequestMethod.POST)
	public String requestCreateNewUsernameAndPassword(Model model, HttpServletRequest request ,@Valid Customer customer, BindingResult bindingresult){
		String button = request.getParameter("submit");
		
		if(button.equalsIgnoreCase("previous"))
			return "login";
		
		if(bindingresult.hasErrors()){
			return "newCustomer";
		}
		
		c1 = customer;
		model.addAttribute(new UsernamePassword());
		return "newUsernamePassword";
	}
	
	@RequestMapping(value="/createBankAccount", method=RequestMethod.POST)
	public String requestCreateNewBankAccount(Model model, HttpServletRequest request ,@Valid UsernamePassword usernamepassword, BindingResult bindingresult){
		String button = request.getParameter("submit");
		
		if(button.equalsIgnoreCase("previous")){
			model.addAttribute(new Customer());
			return "newCustomer";		
		}
		
		new PasswordValidator().validate(usernamepassword, bindingresult);
		
		
		if(bindingresult.hasErrors()){
			return "newUsernamePassword";
		}
		
		
		up1  = usernamepassword;
		model.addAttribute(new BankAccount());
		return "newBankAccounts";
	}
	
	List<BankAccount>list = new ArrayList<BankAccount>();
	@RequestMapping(value="/finishProcess", method=RequestMethod.POST)
	public String requesFinish(Model model, HttpServletRequest request ,@Valid BankAccount bankAccount, BindingResult bindingresult){
		String button = request.getParameter("submit");
		
		if(button.equalsIgnoreCase("previous")){
			model.addAttribute(new Customer());
			return "newUsernamePassword";
			
		}

		if(bindingresult.hasErrors()){
			return "newBankAccounts";
		}
		
		list.add(bankAccount);

		
		if(button.equalsIgnoreCase("Add Another Account")){
			model.addAttribute(new BankAccount());
			return "newBankAccounts";
		}
		
		customerService.addCustomer(c1);
		UserPass userpass = new UserPass(up1.getUsername(), up1.getPassword(),c1);
		
		usernamepasswordservice.addUsernamePassword(userpass);
		
		for(BankAccount b1: list){
			b1.setCustomer(c1);
			bankAccountService.addBankAccount(b1);
		}
		
		list = new ArrayList<BankAccount>();
		return "login";
	}

}
