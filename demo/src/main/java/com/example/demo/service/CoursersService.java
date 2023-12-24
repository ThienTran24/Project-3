package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Courses;
@Service
public interface CoursersService {

	public List<Courses> pageCourseByCategory(String category, Long page, Long numPer);
	
	public Optional<Courses> findById(Long id);
	
	public Long countByCategory(String category);
}
