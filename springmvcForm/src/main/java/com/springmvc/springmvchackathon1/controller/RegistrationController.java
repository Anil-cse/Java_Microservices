package com.springmvc.springmvchackathon1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.springmvchackathon1.dao.DBAppDao;
import com.springmvc.springmvchackathon1.model.Register;

@Controller
public class RegistrationController {
	
	
	@Autowired
	DBAppDao dao;

	public RegistrationController(DBAppDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/")
	public String getUsers(Model model) {
		model.addAttribute(dao.getAllUsers());
		return "index";
	}
	
	@RequestMapping("/register")
	public String RegisterPage(Model model) {
		
		return "register";
	}
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute Register user, Model model) {
		dao.registerUser(user);
		model.addAttribute("successfulmsg", "Registration Successful");
		return "index";
	}
	
	

}
