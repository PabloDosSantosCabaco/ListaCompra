package com.example.springboot;

import org.springframework.stereotype.Service;

@Service
public class ShoppingListService {
	int valor = 0;
	public int incrementValue(int n) {
		valor += n;
		return valor;
	}
}
