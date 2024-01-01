package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Lessons;

@Repository
public interface LessonsRepository extends CrudRepository<Lessons, Long>{

	@Query(value = "select d from Lessons d where d.link Like %:link%", nativeQuery = false)
	public List<Lessons> findByLink(@Param("link") String link);
}
