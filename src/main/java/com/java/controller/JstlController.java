package com.java.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.form.JstlForm;

@Controller
@RequestMapping("/")
public class JstlController {
	
/*	@RequestMapping("el/demo")
	public String demo1 (ModelMap model) {
		List<String> list = new ArrayList<>();
		list.add("Phương");
		list.add("Cường");
		model.addAtribute("items", list);
		return "el/demo";
	}*/
	
	
	/*@RequestMapping("el/demo1")
	public String demo2(ModelMap model) {
		JstlForm sv = new JstlForm("Phương",10.0,"APP");
		model.addAttribute("jstl",sv);
		return "el/demo1";
	}*/
	
	
	@RequestMapping("el/demo2")
	public String demo3(ModelMap model) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Phương");
		map.put("score", 9.5);
		map.put("major", "Toán");
		model.addAttribute("jstl" , map);
		return "jstl";
	}
	
}
