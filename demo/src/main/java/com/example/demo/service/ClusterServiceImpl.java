package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cluster;
import com.example.demo.repository.ClusterRepository;

@Service
public class ClusterServiceImpl implements ClusterService{

	@Autowired
	ClusterRepository clusterRepository;
	
	public List<Cluster> getAll(){
		return (List<Cluster>) clusterRepository.findAll();
	}
}
