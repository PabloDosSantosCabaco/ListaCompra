package com.example.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ShoppingListService {
List<Product> list;
	
	public ShoppingListService() {
		list = new ArrayList<Product>();
	}
	
	public ResponseEntity<Integer> addProduct(Product newProduct,List<Product> ls) {
		for(Product produc:ls) {
			if(produc.getName()==newProduct.getName()) {
				return ResponseEntity.badRequest().build();
			}
		}
		ls.add(newProduct);
		return ResponseEntity.ok().build();
	}
	
	public ResponseEntity<Integer> removeProduct(String name,List<Product> ls) {
		for(Product pr:ls) {
			if(pr.getName()==name) {
				ls.remove(pr);
				return ResponseEntity.ok().build();
			}
		}
		return ResponseEntity.notFound().build();
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
