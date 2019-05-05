package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HomePageController {
	@RequestMapping(value = "/homepage", method = RequestMethod.GET)
	public String hompage() {
		return "homepage";
	}
}
