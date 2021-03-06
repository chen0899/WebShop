package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Country;

public interface CountryService {

	Country save(Country country);
	Country findByNameCountry(String nameCountry);
	List<Country> findAll();
	Country findOne(int id);
	boolean delete(int id);
}
