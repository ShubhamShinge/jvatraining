package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.customer.Customer;
import com.training.customer.orders.Order;
import com.training.galaxe.Employee;
import com.training.targus.Bag;
import com.training.targus.Bill;

@SpringBootApplication
@RestController
public class ProductAppGalaxeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductAppGalaxeApplication.class, args);
	}
	@Autowired(required = false)
	Payment payment;
	
	@Autowired
	Bag bag;
	
	@Autowired
	Bill bill;
	
	@Autowired
	Customer customer;
	
	@Autowired
	Order order;
	
	@Autowired
	Employee employee;
	
	@GetMapping()
	public String home() {
		return "Welcome To Home Page.";
	}
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to my Home Page";
	}
	@GetMapping("/message")
	public String display() {
		return "Welcome to My Home "+payment.pay()+" Bag Component"+bag.GetDetails()+" Bill Details Are:"
				+bill.getBill()+" of Customer--"+customer.getDetails()+order.getDetails()+employee.getDetails();
	}
	

}
