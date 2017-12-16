package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Diller;
import com.example.demo.repository.DillerRepository;
import com.example.demo.service.DillerService;

@Service
public class DillerServiceImpl implements DillerService{

	@Autowired
	private DillerRepository dillerRepository;
	
	public Diller save(Diller diller) {
		return dillerRepository.save(diller);
		
	}

	public List<Diller> findAll() {
		return dillerRepository.findAll();
	}

	public Diller findOne(int id) {
		return dillerRepository.findOne(id);
	}

	public boolean delete(int id) {
		dillerRepository.delete(id);
		return true;
		
	}

	
	
}
