package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Courses;
import com.example.demo.service.CoursersService;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

	@Autowired
	CoursersService coursersService;
	
	@GetMapping(value = "/{id}")
	public Optional<Courses> findById(@PathVariable("id") Long id) {
		if(id == null) {
			return null;
		}else {
			return coursersService.findById(id);
		}
	}
	
	@GetMapping(value = "/category/{category}/{page}")
	public List<Courses> getByCategoryPaging(@PathVariable("category") String category 
			,@PathVariable("page") Long page){
		return coursersService.pageCourseByCategory(category, page, Long.valueOf(5));
	}
	
	@GetMapping(value = "/countCategory/{category}")
	public Long countByCategory(@PathVariable("category") String category) {
		return coursersService.countByCategory(category);
	}
	
}
