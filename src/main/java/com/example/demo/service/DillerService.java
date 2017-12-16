package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Diller;

public interface DillerService {

	Diller save(Diller diller);
	List<Diller> findAll();
	Diller findOne(int id);
	boolean delete(int id);
	
}
