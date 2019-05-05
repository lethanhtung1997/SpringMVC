package com.java.form;

import java.sql.Date;

public class Product {
	private String name;
	private Date date;
	private Double price;
	private Double discount;

	public Product() {
		super();
		//this.date = new Date();
	}

	public Product(String name, Double price, Double discount) {
		super();
		this.name = name;
		//this.date = new Date();
		this.price = price;
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

}
