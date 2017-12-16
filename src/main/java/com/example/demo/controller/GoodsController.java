package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Goods;
import com.example.demo.request.DeleteRequest;
import com.example.demo.service.GoodsService;

@RestController
@RequestMapping("/goods")
@CrossOrigin
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
	@GetMapping
	public List<Goods> goods(){
		return goodsService.findAll();
	}
	
	@PutMapping
	public Goods save(@RequestBody Goods goods) throws IOException {
		return goodsService.save(goods);
	}
	
	@DeleteMapping
	public boolean delete(@RequestBody DeleteRequest request){
		return goodsService.delete(request.getId());
	}
}
