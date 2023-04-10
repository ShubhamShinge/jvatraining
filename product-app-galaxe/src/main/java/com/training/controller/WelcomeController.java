package com.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hi")
public class WelcomeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@RequestMapping()
	public String getMessage() {
		return "Hi Shubham.";
	}
	@RequestMapping("welcome")
	public String home() {
		return "How Are You?";
	}

}
