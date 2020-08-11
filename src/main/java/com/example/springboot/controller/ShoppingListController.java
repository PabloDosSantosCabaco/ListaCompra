package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.service.Product;
import com.example.springboot.service.ShoppingListService;

@RestController
@RequestMapping("/api/v1/item")
public class ShoppingListController {
	@Autowired
	private ShoppingListService lista = new ShoppingListService();
	
	@DeleteMapping
	public ResponseEntity<Integer> removeProduct(@RequestParam("name") String name) {
		return lista.removeProduct(name)
				? ResponseEntity.ok().build()
				: ResponseEntity.notFound().build();
	}
	@GetMapping
	public List<Product> getList() {
		return lista.getList();
	}
	@PostMapping
	public ResponseEntity<Integer> addProduct(Product newProduct) {
		return lista.addProduct(newProduct)?ResponseEntity.ok().build():ResponseEntity.badRequest().build();
	}

}