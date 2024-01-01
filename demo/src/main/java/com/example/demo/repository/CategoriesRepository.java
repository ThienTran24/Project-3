package com.example.demo.repository;

import java.util.List;

import org.hibernate.annotations.Parent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Categories;

@Repository
public interface CategoriesRepository extends CrudRepository<Categories, Long>{

	
	@Query(value = "select * from categories order by random() limit :num", nativeQuery = true)
	public List<Categories> getRandomCategories(@Param("num") Long num);
	
	@Query(value = "select * from( "
			+ "	select DISTINCT(parent_category) as parent_category from public.categories "
			+ "	where parent_category NOT Like 'Uncategorized' "
			+ "	union "
			+ "	select DISTINCT(category) as parent_category from public.categories "
			+ "	where parent_category Like 'Uncategorized' "
			+ ") order by random() limit :limit", nativeQuery = true)
	public List<String> getMasterCategory(@Param("limit") long limit);
}
