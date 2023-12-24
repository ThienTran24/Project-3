package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Providers;

@Repository
public interface ProvidersRepository extends CrudRepository<Providers, Long> {

}
