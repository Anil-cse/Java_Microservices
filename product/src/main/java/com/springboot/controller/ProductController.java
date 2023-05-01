package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.modal.Product;

@RestController
public class ProductController {

	Product product = new Product();

	public Product get(@RequestBody Product product) {
		return product;
	}

	@GetMapping(value = "/message")
	public String getMessage() {
		return "This is message from controller";
	}

	@GetMapping(value = "/product")
	public Product getProduct() {

		return product;
	}

}
