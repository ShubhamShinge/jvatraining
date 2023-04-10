package com.training.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Employee;

@RestController
//Only requestmapping is allowed here
@RequestMapping("employee")
public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//we can use both getmapping and requestmapping here
	@GetMapping("/message")
	public String getMesaage() {
		return "Welcome Employee";
	}
	
	//pathvariable is used pass variables to web path/url
	//{variable}
	@GetMapping("message/{empName}")
	public String getMessage2(@PathVariable("empName")String eName) {
		return "Hi "+eName;
	}
	
	@GetMapping("message/{num1}/and/{num2}")
	public String getMessage3(@PathVariable("num1")int a,@PathVariable("num2")int b) {
		return "Sum of the two numbers is:"+(a+b);
	}
	
	@PostMapping("/message")
	public String getMessage3(@RequestBody Employee employee) {
		return "Hi "+employee.getEmpName()+" Your record saved successfully. Here are your records:"+employee;
	}
	@PutMapping("/message")
	public String getMessage4() {
		return "Hi Galaxe - PUT";
	}
	@DeleteMapping("/message")
	public String getMessage5(){
		return "Hi Galaxe - DELETE";
	}
}
