package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Prueba {

	@GetMapping("/vivaespañita")
	public String metodoPrueba() {
		return "El rey es lo más";
	}
	
}
