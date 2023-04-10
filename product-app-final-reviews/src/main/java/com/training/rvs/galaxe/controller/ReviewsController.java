package com.training.rvs.galaxe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.rvs.galaxe.client.ProductClient;
import com.training.rvs.galaxe.model.Product;

@RestController
@RequestMapping("reviewsproduct")
public class ReviewsController {

	public ReviewsController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	ProductClient productClient;
	
	
	@GetMapping("/productData/{id}")			// http://localhost:9091/reviewsproduct/productData/198
	public Product getProductDataForReview(@PathVariable("id")int id) {
			return productClient.getProductData(id);
	}

}