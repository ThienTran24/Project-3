package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Categories;
import com.example.demo.model.Cluster;

@Repository
public interface ClusterRepository extends CrudRepository<Cluster, Long>{

}
