package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.form.Student1;

@Controller
@RequestMapping("/")
public class ValidateController {
	@RequestMapping("validate1")
	public String login(ModelMap model) {
		Student1 sv = new Student1("Le Thanh Tung", 9.5);
		model.addAttribute("validate", sv);
		return "validate";
	}

	@RequestMapping(value = "validate1", method = RequestMethod.POST)
	public String validate1(@ModelAttribute("validate") Student1 sv, BindingResult errors, final Model model) {
		if (sv.getName().trim().length() == 0) {
			errors.rejectValue("name", "validate", "Vui long nhap ho ten !");
		}
		if (sv.getMark() == null) {
			errors.rejectValue("mark", "validate", "Vui long nhap diem");
		} else if (sv.getMark() < 0 || sv.getMark() > 10) {
			errors.rejectValue("mark", "validate", "Diem khong hop le");
		}
		if (errors.hasErrors()) {
			model.addAttribute("message", "Vui long sua cac loi sau day !");
		} else {
			model.addAttribute("message", "Chuc mung ban nhap dung !");
		}
		return"validate";

	}
}
