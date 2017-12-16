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

import com.example.demo.entity.Country;
import com.example.demo.request.DeleteRequest;
import com.example.demo.service.CountryService;

@RestController
@RequestMapping("/country")
@CrossOrigin
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@GetMapping
	public List<Country> country(){
		return countryService.findAll();
	}
	
	@PutMapping
	public Country save(@RequestBody Country country){
		return countryService.save(country);
	}
	
	@DeleteMapping
	public boolean delete(@RequestBody DeleteRequest request){
		return countryService.delete(request.getId());
	}
}
