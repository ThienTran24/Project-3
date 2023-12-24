package com.example.demo.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Courses;

@Repository
public interface CoursersRepository extends CrudRepository<Courses, Long> {
	
	@Query(value = "select * from courses d where d.masterCategories Like :category "
			+ "order by case when d.numReviews Like 'NaN' then 1 else 0 end, "
			+ "CAST(replace(d.numReviews, ',', '')*CAST(replace(d.starts, ',', '') DESC "
			+ "offset :nextRow rows fetch first :numRow row only "
			,nativeQuery = true)
	public List<Courses> getCoursePagable(@Param("category") String category, @Param("nextRow") Long nextRow
			, @Param("numRow") Long numRow);
	
	@Query(value = "select count(d) from Courses d where "
			+ "d.masterCategories Like :category ", nativeQuery = false)
	public Long countByCategory(@Param("category") String category);
}
