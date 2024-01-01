package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
			,@PathVariable("page") int page){
		return coursersService.pageCourseByCategory(category, page, 5);
	}
	
	@GetMapping(value = "/countCategory/{category}")
	public Long countByCategory(@PathVariable("category") String category) {
		return coursersService.countByCategory(category);
	}
	
	@GetMapping(value = "/{id}/cluster/{cluster}")
	public List<Courses> findByCluster(@PathVariable("cluster") String cluster, @PathVariable("id") Long id){
		return coursersService.findByCluster(cluster, id);
	}
	
	@GetMapping(value = "/name/{name}")
	public List<Courses> findByName(@PathVariable("name") String name){
		return coursersService.findByName(name);
	}
	
	@GetMapping(value = "/filter/{page}")
	public List<Courses> filterCourse(@RequestParam(name = "category", required = false, defaultValue = "") String category,
			@RequestParam(name = "name", required = false, defaultValue = "") String name, @RequestParam(name = "stars", required = false, defaultValue = "0") Double stars,
			@RequestParam(name = "botDur", required = false) Double botDur, @RequestParam(name = "topDur", required = false) Double topDur,@PathVariable("page") int page){
		return coursersService.filter(category, name, stars, botDur, topDur, page);
	}
}
