package com.java.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.form.RegisterForm;
import com.java.javabean.Account;

@Controller
public class RegisterPageController {
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(final Model model) {
		model.addAttribute("registerForm", new RegisterForm());
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String doRegister(final Model model, @ModelAttribute("registerForm") final RegisterForm registerForm,
			BindingResult errors, HttpSession session) {
		Account account = new Account();
		account.setEmail(registerForm.getEmail());
		account.setPassword(registerForm.getPassword());
		account.setName(registerForm.getName());
		account.setPhoneNumber(registerForm.getPhoneNumber());
		account.setGender(registerForm.getGender());
		List<Account> users = (List<Account>) session.getAttribute("users");
		if (users != null) {
			users.add(account);
			session.setAttribute("users", users);
		} else {
			List<Account> accounts = new ArrayList<Account>();
			accounts.add(account);
			session.setAttribute("users", accounts);
		}
		System.out.println(session.getAttribute("users"));
		return "redirect:/homepage";
	}

	@ModelAttribute("genders")
	public Map<String, String> getGenders() {
		Map<String, String> genders = new HashMap<String, String>();
		genders.put("M", "Nam");
		genders.put("F", "Nu");
		return genders;
	}

}
