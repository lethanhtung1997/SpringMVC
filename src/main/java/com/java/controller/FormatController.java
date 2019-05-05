package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.form.Product;

@Controller
@RequestMapping("/")
public class FormatController {
	@RequestMapping("format")
	public String format(ModelMap model) {
		Product pr = new Product("Iphone10",2579.5,0.05);
		model.addAttribute("product",pr);
		return "jstl/format";
	}
	
}