package com.java.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.form.Student2;
import com.java.javabean.Major;

@Controller
@RequestMapping
public class Validate2Controller {
	@RequestMapping("validator")
	public String login(ModelMap model) {
		Student2 sv = new Student2("Le Thanh Tung", 9.5, "Information technology");
		model.addAttribute("validate2", sv);
		return "validate2";
	}

	@RequestMapping(value = "validator", method = RequestMethod.POST)
	public String validator(ModelMap model,@ModelAttribute("validator2") @Validated Student2 sv,
			BindingResult errors) {
		if (errors.hasErrors()) {
			model.addAttribute("message", "Vui lòng sửa các lỗi sau đây !");
		} else {
			model.addAttribute("message", "Chúc mừng bạn đã nhập đúng!");
		}

		return "validate2";
	}

	@ModelAttribute("majors")
	public List<Major> getMajors() {
		return Arrays.asList(new Major("Mathematics", "Toán học"), new Major("Information", "Thiết kế web"));
	}

}
