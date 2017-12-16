package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Category;
import com.example.demo.request.DeleteRequest;
import com.example.demo.service.CategoryService;

@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public List<Category> category(){
		return categoryService.findAll();
	}
	
	@PutMapping
	public Category register(@RequestBody Category category){
		return categoryService.save(category);
	}
	
	@DeleteMapping
	public boolean delete(@RequestBody DeleteRequest request){
		return categoryService.delete(request.getId());
	}
}
