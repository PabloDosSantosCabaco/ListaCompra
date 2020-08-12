package com.example.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ShoppingListService {
	List<Product> list;
	
	public ShoppingListService() {
		list = new ArrayList<Product>();
	}
	
	public boolean addProduct(Product newProduct) {
		for(Product product:list) {
			if(product.getName().equals(newProduct.getName())) {
				return false;
			}
		}
		list.add(newProduct);
		return true;
	}
	
	public boolean removeProduct(String name) {
		for(Product pr:list) {
			if(pr.getName().equals(name)) {
				list.remove(pr);
				return true;
			}
		}
		return false;
	}
	
	public List<Product> getList() {
		return list;
	}
	
	int valor = 0;
	public int incrementValue(int n) {
		valor += n;
		return valor;
	}
}
