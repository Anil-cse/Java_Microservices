package com.example.democonfigclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class configController {

	@Autowired
	Environment environment;
	
	@GetMapping("/v1/getMapping")
	public String getMaximum()
	{
		return "maximum is " +environment.getProperty("maximum");
	}
}
