package com.training.pms.galaxe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("home")						//localhost:9093/home
	public String home() {
		return "Welcome to my home - Shubham Shinge";
	}
}
