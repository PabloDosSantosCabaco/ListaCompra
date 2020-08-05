package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.ShoppingListService;

@RestController
public class HelloController {
	@Autowired
	ShoppingListService sls;
	
	@GetMapping("/getShop")
	public int getShop(int n) {
		return sls.incrementValue(n);
	}
	
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}