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
	public ResponseEntity<Integer> removeProduct(@RequestParam("name") String name,List<Product> ls) {
		return lista.removeProduct(name, ls)?ResponseEntity.ok().build():ResponseEntity.notFound().build();
	}
	@GetMapping
	public List<Product> showList() {
		return lista.showList();
	}
	@PostMapping
	public ResponseEntity<Integer> addProduct(Product newProduct,List<Product> ls) {
		return lista.addProduct(newProduct, ls)?ResponseEntity.ok().build():ResponseEntity.badRequest().build();
	}

}