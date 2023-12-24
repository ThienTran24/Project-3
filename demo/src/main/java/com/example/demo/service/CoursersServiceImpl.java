package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Courses;
import com.example.demo.repository.CoursersRepository;
@Service
public class CoursersServiceImpl implements CoursersService {
	
	@Autowired
	CoursersRepository coursersRepository;
	
	@Transactional(readOnly = true)
	public List<Courses> pageCourseByCategory(String category, Long page, Long numPer){
		return coursersRepository.getCoursePagable(category, numPer*(page - 1), page);
	}
	
	@Transactional(readOnly = true)
	public Optional<Courses> findById(Long id) {
		return coursersRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public Long countByCategory(String category) {
		return coursersRepository.countByCategory(category);
	}
}
