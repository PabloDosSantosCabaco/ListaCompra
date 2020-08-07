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
	
	public boolean addProduct(Product newProduct,List<Product> ls) {
		for(Product produc:ls) {
			if(produc.getName()==newProduct.getName()) {
				return false;
			}
		}
		ls.add(newProduct);
		return true;
	}
	
	public boolean removeProduct(String name,List<Product> ls) {
		for(Product pr:ls) {
			if(pr.getName()==name) {
				ls.remove(pr);
				return true;
			}
		}
		return false;
	}
	
	public List<Product> showList() {
		return list;
	}
	
	int valor = 0;
	public int incrementValue(int n) {
		valor += n;
		return valor;
	}
}
