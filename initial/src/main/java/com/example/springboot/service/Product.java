package com.example.springboot.service;

public class Product {
	String name;
	float price;
	boolean toBuy;
	
	public Product(String name,float price,boolean toBuy) {
		setName(name);
		setPrice(price);
		setToBuy(toBuy);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isToBuy() {
		return toBuy;
	}
	public void setToBuy(boolean toBuy) {
		this.toBuy = toBuy;
	}
	
}
