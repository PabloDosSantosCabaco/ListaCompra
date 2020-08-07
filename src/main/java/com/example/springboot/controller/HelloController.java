package com.example.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.ShoppingListService;
import com.example.springboot.service.Product;

@RestController
@RequestMapping("/api/v1/item")
public class HelloController {
	List<Product> ls = new ArrayList<Product>();
	
	@Autowired
	ShoppingListService sls;
	
	@DeleteMapping
	public int removeProduct(@RequestParam("name")String name) {
		for(Product pr:ls) {
			if(pr.getName()==name) {
				ls.remove(pr);
				return 200;
			}
		}
		return 404;
	}
	@GetMapping
	public List<Product> showList() {
		return ls;
	}
	@PostMapping
	public int addProduct(Product p) {
		if(!ls.contains(p)) {
			ls.add(p);
			return 200;
		}
		return 400;
	}

}