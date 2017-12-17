package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import com.example.demo.request.SearchingRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	@PostMapping("/search")
	public List<Goods> findGoods(@RequestBody SearchingRequest searchingRequest){
		return goodsService.find(searchingRequest);
	}

	@DeleteMapping
	public boolean delete(@RequestBody DeleteRequest request){
		return goodsService.delete(request.getId());
	}
}
