package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Courses;
@Service
public interface CoursersService {

	public List<Courses> pageCourseByCategory(String category, int page, int numPer);
	
	public Optional<Courses> findById(Long id);
	
	public Long countByCategory(String category);
	
	public List<Courses> findByCluster(String clusterId, Long courseId);
	
	public List<Courses> findByName(String name);
	
	public List<Courses> filter(String category, String name, Double start,
			Double botDur, Double topDur, int page);
}
