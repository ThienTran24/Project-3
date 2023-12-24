package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Categories;
import com.example.demo.service.CategoriesService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/category")

public class CategoriesController {
	
	@Autowired
	CategoriesService categoriesService;
	
	@GetMapping("/random")
	public List<Categories> getMethodName() {
		return categoriesService.getRandomCategories(Long.valueOf(3));
	}
	
}
