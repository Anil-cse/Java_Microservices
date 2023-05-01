package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Feign.ProductFeignClient;

@RestController
public class OrderController {
	
	@Autowired
	ProductFeignClient productFeignClient;

	@GetMapping(value = "/v1/getOrder")
	public String getOrder()
	{
		return "this is order";
	}
	
	@GetMapping(value = "/v1/getOrderWithProduct")
	public String getProduct()
	{
		return productFeignClient.getProduct();
	}
}
