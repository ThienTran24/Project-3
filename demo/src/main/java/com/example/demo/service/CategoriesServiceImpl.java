package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Categories;
import com.example.demo.repository.CategoriesRepository;


@Service
public class CategoriesServiceImpl implements CategoriesService {

	@Autowired
	CategoriesRepository categoriesRepository;
	
	@Transactional(readOnly = true)
	public List<Categories> getRandomCategories(Long num){
		return categoriesRepository.getRandomCategories(num);
	}
	
	@Transactional(readOnly = true)
	public List<String> getMasterCategoryName(Long num){
		return categoriesRepository.getMasterCategory(num);
	}
}
