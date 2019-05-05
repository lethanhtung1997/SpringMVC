package com.java.form;

public class JstlForm {
	private String name;
	private double score;
	private String major;

	public JstlForm(String name, double score, String major) {
		super();
		this.name = name;
		this.score = score;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
