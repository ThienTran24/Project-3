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
	public List<Courses> pageCourseByCategory(String category, int page, int numPer){
		return coursersRepository.getCoursePagable(category, numPer*(page - 1), numPer);
	}
	
	@Transactional(readOnly = true)
	public Optional<Courses> findById(Long id) {
		return coursersRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public Long countByCategory(String category) {
		return coursersRepository.countByCategory(category);
	}
	
	@Transactional(readOnly = true)
	public List<Courses> findByCluster(String clusterId, Long courseId){
		return coursersRepository.getCourseByCluster(clusterId, courseId);
	}
	
	@Transactional(readOnly = true)
	public List<Courses> findByName(String name){
		return coursersRepository.findByName(name); 
	}
	
	@Transactional(readOnly = true)
	public List<Courses> filter(String category, String name, Double stars,
			Double botDur, Double topDur, int page){
		if(botDur == null && topDur != null) {
			return coursersRepository.getCourseFilterTop(category, name, stars, topDur, 20*(page - 1), 20);
		}else if(topDur == null && botDur != null) {
			return coursersRepository.getCourseFilterBot(category, name, stars, botDur, 20*(page - 1), 20);
		}else if(botDur == null && topDur == null){
			return coursersRepository.getCourseFilterTop(category, name, stars, 0.0, 20*(page - 1), 20);
		}else {
			return coursersRepository.getCourseFilter(category, name, stars, botDur, topDur, 20*(page - 1), 20);
		}
	}
}
