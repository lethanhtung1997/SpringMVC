package com.java.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.form.StudentForm;
import com.java.javabean.Major;

@Controller
@RequestMapping("/")
public class StudentController {
	@RequestMapping("edit123123")
	public String edit(ModelMap model) {
		StudentForm sv = new StudentForm("Le Thanh Tung", 9.5, "Information and Technology", "Female",
				Arrays.asList("VI"), Arrays.asList("Music"));
		model.addAttribute("student", sv);
		return "student";
	}

	@RequestMapping(path = "update", method = RequestMethod.POST)
	public String update(final Model model, @ModelAttribute("student") StudentForm sv) {
		model.addAttribute("username", sv.getName());
		System.out.println(sv.getMajor());
		System.out.println(sv.getName());
		System.out.println(sv.getMark());
		return "/welcom";
	}

	@ModelAttribute("majors")
	public List<Major> getMajors() {
		return Arrays.asList(new Major("Mathematics", "Toán học"), new Major("Information and Technology", "CNTT"));
	}

	@ModelAttribute("genders")
	public List<String> getGenders() {
		return Arrays.asList("Female", "Male");
	}

	@ModelAttribute("hobbies")
	public List<String> getHobbies() {
		return Arrays.asList("Football", "Music", "Game");
	}

	@ModelAttribute("languages")
	public Map<String, String> getLanguages() {
		return new HashMap<String, String>() {
			{
				put("EN", "English");
				put("VI", "Vietnamese");

			}
		};
	}

	/*
	 * @ModelAttribute("majors")//(key=value;value=label) //dung
	 * List<String>(value=label gia tri hien thi) public Map<String, String>
	 * getMajors(){ return ImmutableMap.of("Web",
	 * "Lập trình web","Marketing","Bán hàng marketing");
	 * 
	 * }
	 */
}