package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	
	
	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Category findByName(String nameCategory) {
		return categoryRepository.findByNameCategory(nameCategory);
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category findOne(int id) {
		return categoryRepository.findOne(id);
	}

	@Override
	public boolean delete(int id) {
		categoryRepository.delete(categoryRepository.findOne(id));
		return true;
		
	}


	
	
	

}
