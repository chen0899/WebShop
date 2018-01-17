package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Country;
import com.example.demo.repository.CountryRepository;
import com.example.demo.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService{

	@Autowired
	private CountryRepository countryRepository;
	
	public Country save(Country country) {
		return countryRepository.save(country);
		
	}

	@Override
	public Country findByNameCountry(String nameCountry) {
		return countryRepository.findByNameCountry(nameCountry);
	}

	public List<Country> findAll() {
		return countryRepository.findAll();
	}

	public Country findOne(int id) {
		return countryRepository.findOne(id);
	}

	public boolean delete(int id) {
		countryRepository.delete(id);
		return true;
		
	}
	


}
