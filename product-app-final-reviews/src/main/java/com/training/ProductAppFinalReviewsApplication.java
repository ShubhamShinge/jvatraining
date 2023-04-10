package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProductAppFinalReviewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductAppFinalReviewsApplication.class, args);
		System.out.println("9091 Started");
	}

}
