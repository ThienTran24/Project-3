package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cluster;
import com.example.demo.service.ClusterService;

@RestController
@RequestMapping(value = "/cluster")
public class ClusterController {

	@Autowired
	ClusterService clusterService;
	
	@GetMapping(value = "/getAll")
	public List<Cluster> getAll(){
		return clusterService.getAll();
	}
}
