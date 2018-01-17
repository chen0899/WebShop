package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Category;

public interface CategoryService {
	
	Category save(Category category);
	Category findByName(String nameCategory);
	List<Category> findAll();
	Category findOne(int id);
	boolean delete(int id);

}
