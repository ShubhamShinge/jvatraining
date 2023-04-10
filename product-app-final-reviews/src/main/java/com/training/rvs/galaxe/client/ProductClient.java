package com.training.rvs.galaxe.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.training.rvs.galaxe.model.Product;

@FeignClient(name = "product-client" , url="http://localhost:9090")
public interface ProductClient {

	@GetMapping("/product/{productId}")													
	Product getProductData(@PathVariable("productId")int productId);

}




