package com.java.form;

import java.util.List;

public class StudentForm {
	private String name;
	private Double mark;
	private String major;
	private String gender;
	private List<String> languages;
	private List<String> hobbies;

	public StudentForm(String name, Double mark, String major, String gender, List<String> languages,
			List<String> hobbies) {
		super();
		this.name = name;
		this.mark = mark;
		this.major = major;
		this.gender = gender;
		this.languages = languages;
		this.hobbies = hobbies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMark() {
		return mark;
	}

	public void setMark(Double mark) {
		this.mark = mark;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
}
