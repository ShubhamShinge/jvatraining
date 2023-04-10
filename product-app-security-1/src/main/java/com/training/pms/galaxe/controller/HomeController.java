package com.training.pms.galaxe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/hello")					//localhost:9094/hello
	public String hello() {
		return "Hello and welcome to my APP";
	}
	
}