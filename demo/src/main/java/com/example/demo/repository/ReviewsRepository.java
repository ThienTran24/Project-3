package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Reviews;

@Repository
public interface ReviewsRepository extends CrudRepository<Reviews, Long>{

}
