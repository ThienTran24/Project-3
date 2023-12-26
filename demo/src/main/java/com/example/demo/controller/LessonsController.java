package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Lessons;
import com.example.demo.service.LessonsService;

@RestController
@RequestMapping(value = "/lessons")
public class LessonsController {

	@Autowired
	LessonsService lessonsService;
	
	@GetMapping(value = "/{id}")
	public Optional<Lessons> findById(@PathVariable("id") Long id){
		return lessonsService.findById(id);
	}
	
	@GetMapping(value = "/link/{link}")
	public List<Lessons> findByLink(String link){
		return lessonsService.findAllByLink(link);
	}
}
