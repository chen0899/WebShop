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

import com.example.demo.entity.Diller;
import com.example.demo.request.DeleteRequest;
import com.example.demo.service.DillerService;

@RestController
@RequestMapping("/diller")
@CrossOrigin
public class DillerController {

	@Autowired
	private DillerService dillerService;
	
	@GetMapping
	public List<Diller> diller(){
		return dillerService.findAll();
	}
	
	@PutMapping
	public Diller save(@RequestBody Diller diller) {
		return dillerService.save(diller);
	}
	
	@DeleteMapping
	public boolean delete(@RequestBody DeleteRequest request){
		return dillerService.delete(request.getId());
	}
	
}
