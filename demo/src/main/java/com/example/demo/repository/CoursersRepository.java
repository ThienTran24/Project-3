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
	
	@Query(value = "select d.* from public.courses d where d.mastercategories Like :category or d.categories Like :category "
			+ "order by case when d.numReviews Like 'NaN' then 1 else 0 end, "
			+ "CAST(replace(d.numReviews, ',', '') As Decimal)*CAST(replace(d.stars, ',', '') As Decimal) DESC "
			+ "OFFSET :nextRow ROWS "
			+ "FETCH FIRST :numRow ROW ONLY "
			,nativeQuery = true)
	public List<Courses> getCoursePagable(@Param("category") String category, @Param("nextRow") int nextRow
			, @Param("numRow") int numRow);
	
	@Query(value = "select count(d) from Courses d where "
			+ "d.masterCategories Like :category  or d.categories Like :category ", nativeQuery = false)
	public Long countByCategory(@Param("category") String category);
	
	@Query(value = "select d.* from public.courses d where d.cluster Like :cluster "
			+ "and d.course_id <> :courseId LIMIT 10", nativeQuery = true)
	public List<Courses> getCourseByCluster(@Param("cluster") String cluster, 
			@Param("courseId") Long courseId);
	
	@Query(value = "select d from Courses d where d.courseName Like %:name%", nativeQuery = false)
	public List<Courses> findByName(@Param("name") String name);
	
	@Query(value = "select d.* from public.courses d where (1=1 or (d.mastercategories Like :category or d.categories Like :category)) "
			+ "and (1=1 or (d.name Like ('%' || :name || '%'))) and (1=1 or (CAST(d.stars As Decimal) >= :stars)) "
			+ "and (1=1 or ((CAST(d.duration As Decimal) >= :botDur) and (CAST(d.duration As Decimal) <= :topDur))) "
			+ "order by case when d.numReviews Like 'NaN' then 1 else 0 end, "
			+ "CAST(replace(d.numReviews, ',', '') As Decimal)*CAST(replace(d.stars, ',', '') As Decimal) DESC "
			+ "OFFSET :nextRow ROWS "
			+ "FETCH FIRST :numRow ROW ONLY ", nativeQuery = true)
	public List<Courses> getCourseFilter(@Param("category") String category,
			@Param("name") String name, @Param("stars") Double stars,
			@Param("botDur") Double botDur, @Param("topDur") Double topDur
			,@Param("nextRow") int nextRow, @Param("numRow") int numRow);
	
	@Query(value = "select d.* from public.courses d where (1=1 or (d.mastercategories Like :category or d.categories Like :category)) "
			+ "and (1=1 or (d.name Like ('%' || :name || '%'))) and (1=1 or (CAST(d.stars As Decimal) >= :stars)) "
			+ "and (1=1 or (CAST(d.duration As Decimal) >= :topDur)) "
			+ "order by case when d.numReviews Like 'NaN' then 1 else 0 end, "
			+ "CAST(replace(d.numReviews, ',', '') As Decimal)*CAST(replace(d.stars, ',', '') As Decimal) DESC "
			+ "OFFSET :nextRow ROWS "
			+ "FETCH FIRST :numRow ROW ONLY ", nativeQuery = true)
	public List<Courses> getCourseFilterTop(@Param("category") String category,
			@Param("name") String name, @Param("stars") Double stars, @Param("topDur") Double topDur
			,@Param("nextRow") int nextRow, @Param("numRow") int numRow);
	
	@Query(value = "select d.* from public.courses d where (1=1 or (d.mastercategories Like :category or d.categories Like :category)) "
			+ "and (1=1 or (d.name Like ('%' || :name || '%'))) and (1=1 or (CAST(d.stars As Decimal) >= :stars)) "
			+ "and (1=1 or (CAST(d.duration As Decimal) <= :botDur)) "
			+ "order by case when d.numReviews Like 'NaN' then 1 else 0 end, "
			+ "CAST(replace(d.numReviews, ',', '') As Decimal)*CAST(replace(d.stars, ',', '') As Decimal) DESC "
			+ "OFFSET :nextRow ROWS "
			+ "FETCH FIRST :numRow ROW ONLY ", nativeQuery = true)
	public List<Courses> getCourseFilterBot(@Param("category") String category,
			@Param("name") String name, @Param("stars") Double stars,@Param("botDur") Double botDur
			,@Param("nextRow") int nextRow, @Param("numRow") int numRow);
}
