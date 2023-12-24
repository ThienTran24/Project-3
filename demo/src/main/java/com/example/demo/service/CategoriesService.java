package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Categories;

public interface CategoriesService {
	
	public List<Categories> getRandomCategories(Long num);
	
	public List<String> getMasterCategoryName(Long num);
}
