package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingController {

	@RequestMapping(path = "/greeting", method = RequestMethod.GET)
	public String greeting(final Model model) {
		model.addAttribute("message", "Hello World");
		return "greeting";
	}

	@RequestMapping(path = "/greeting/{id}", method = RequestMethod.GET)
	public String greeting1(final Model model, @PathVariable(value = "id") final String id) {
		model.addAttribute("message", "Hello World 1");
		return "greeting";
	}

	@RequestMapping(path = "/greeting", method = RequestMethod.GET, params = { "foo", "!bar" })
	public String greeting2(final Model model) {
		model.addAttribute("message", "Hello World 2");
		return "greeting";
	}

	@RequestMapping(path = "/greeting", method = RequestMethod.GET, params = { "!foo", "bar" })
	public String greeting3(final Model model) {
		model.addAttribute("message", "Hello World 2");
		return "greeting";
	}
}
