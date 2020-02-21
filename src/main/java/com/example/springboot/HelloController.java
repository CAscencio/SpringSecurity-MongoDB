package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;

@RestController
@Validated
public class HelloController {

	@GetMapping("/usuario")
	public String usuario() {
		return "Bienvenido Usuario!";
	}

	@GetMapping("/administrador")
	public String administrador() {
		return "Bienvenido administrador!";
	}
}
