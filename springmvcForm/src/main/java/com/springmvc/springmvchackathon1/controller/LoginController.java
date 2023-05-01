package com.springmvc.springmvchackathon1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.springmvchackathon1.dao.DBAppDao;

@Controller
public class LoginController {

	
	@Autowired
	DBAppDao dao;

	public LoginController(DBAppDao dao) {
		this.dao = dao;
	}
	
	
	@PostMapping("/userLogin")
	public String loginUser(@RequestParam String username, @RequestParam String password, ModelMap model) {
		boolean x=dao.loginUser(username, password);
		if(x) {
			String message = "Welcome " + username+ " to the Spring MVC Hackathon";
			model.addAttribute("message", message);
			return "welcome";
		}else
			model.addAttribute("message", "Invalid User !!! Please contact ADMIN.");
			return "welcome";
	}
	

	@RequestMapping("/index")
	public String backToIndex() {
		return "index";
	}
	
	
}
