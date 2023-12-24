package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Keywords;

@Repository
public interface KeywordsRepository  extends CrudRepository<Keywords, Long>{

}
