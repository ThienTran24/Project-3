package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Lessons;
@Service
public interface LessonsService {

	public List<Lessons> findAllByLink(String link);
	
	public Optional<Lessons> findById(Long id);
}
