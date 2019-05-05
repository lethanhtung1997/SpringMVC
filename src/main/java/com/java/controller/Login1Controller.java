package com.java.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.form.Login1Form;
import com.java.javabean.Account;

@Controller
@RequestMapping("/")
public class Login1Controller {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login1(final Model model) {
		model.addAttribute("loginForm", new Login1Form());
		return "login1";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(final HttpSession session) {
		session.removeAttribute("username");
		return "redirect:/";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String doLogin(final Model model, @ModelAttribute("loginForm") final Login1Form loginForm,
			BindingResult errors, HttpSession session) {
		List<Account> users = (List<Account>) session.getAttribute("users");
		if (users == null || users.isEmpty()) {
			model.addAttribute("message", "Tai khoan hoac mat khau khong dung");
			return "login1";
		}
		for (int i = 0; i < users.size(); ++i) {
			Account account = users.get(i);
			if (account.getEmail().equals(loginForm.getEmail())
					&& account.getPassword().equals(loginForm.getPassword())) {
				session.setAttribute("username", account.getName());
				return "redirect:/homepage";
			}
		}
		model.addAttribute("message", "Tai khoan hoac mat khau khong dung");
		return "login1";
	}
}
