package com.java.controller;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.entity.User;
import com.java.facade.UserData;
import com.java.facade.UserFacade;

@Controller
public class UserController {
	@Autowired
	private UserFacade userFacade;

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String addUser(final Model model) {
		model.addAttribute("userData", new UserData());
		return "add_user";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("userData") final UserData userData) {
		final User user = new User();
		user.setId(userData.getId());
		user.setPassword(userData.getPassword());
		user.setFullName(userData.getFullName());
		user.setPhoto(userData.getPhoto());
		user.setEmail(userData.getEmail());
		userFacade.creatUser(user);
		return "redirect:/getAllUsers";
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	public String deleteUser() {
		return "delete_user";
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
	public String deleteUser(@RequestParam("id") final int id) {
		userFacade.deleteUser(id);
		return "redirect:/getAllUsers";
	}

	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public String getAllUsers(final Model model) {
		List<User> users = userFacade.getAllUsers();
		model.addAttribute("users", users);
		return "show_all_users";
	}

	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public String getUser() {
		return "get_user";
	}

	@RequestMapping(value = "/getUser", method = RequestMethod.POST)
	public String getUser(final Model model, @RequestParam("id") final int id) {
		final User user = userFacade.getUserById(id);
		model.addAttribute("user", user);
		return "show_user";
	}

}
