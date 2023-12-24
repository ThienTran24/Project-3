package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Lessons;
import com.example.demo.repository.LessonsRepository;
@Service
public class LessonsServiceImpl implements LessonsService {

	@Autowired
	LessonsRepository lessonRepository;
	
	@Transactional(readOnly = true)
	public List<Lessons> findAllByLink(String link){
		return lessonRepository.findByLink(link);
	}
	
	@Transactional(readOnly = true)
	public Optional<Lessons> findById(Long id) {
		return lessonRepository.findById(id);
	}
}
