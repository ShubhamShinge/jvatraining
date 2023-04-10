package com.training.rvs.galaxe.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.training.rvs.galaxe.model.Reviews;

@RepositoryRestResource(collectionResourceRel = "reviews",path="reviews")
public interface ReviewsRepository extends PagingAndSortingRepository<Reviews,Long>{
	
}
