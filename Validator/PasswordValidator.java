package com.bank.Validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.bank.Model.UsernamePassword;





	@Component
	public class PasswordValidator implements Validator {

		public boolean supports(Class<?> c) {
			return UsernamePassword.class.isAssignableFrom(c);
		}

		public void validate(Object command, Errors errors) {
			UsernamePassword regBean = (UsernamePassword)command;
			if(!regBean.getPassword().equals(regBean.getRePassword()))
				errors.rejectValue("password","password","must be same");
		}
	



}
