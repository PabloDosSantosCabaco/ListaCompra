package com.example.springboot.service;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	List<Product> list;
	
	public Lista() {
		list = new ArrayList<Product>();
	}
	
	public boolean addProduct(Product p) {
		if(!list.contains(p)) {
			list.add(p);
			return true;
		}
		return false;
	}
	
	public boolean deleteProduct(Product p) {
		if(list.contains(p)) {
			list.remove(p);
			return true;
		}
		return false;	
	}
	
	public List<Product> showList() {
		return list;
	}
	
	public boolean markProduct(Product p) {
		for(Product pr:list){
			if(p.getName()==pr.getName()) {
				pr.setToBuy(!pr.isToBuy());
				return true;
			}
		}
		return false;
	}
}
