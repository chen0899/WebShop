package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Goods;
import com.example.demo.repository.GoodsRepository;
import com.example.demo.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	private GoodsRepository goodsRepository;
	
	
	
	public Goods save(Goods goods) {
		return goodsRepository.save(goods);
		
	}

	public List<Goods> findAll() {
		return goodsRepository.findAll();
	}

	public Goods findOne(int id) {
		return goodsRepository.findOne(id);
	}

	public boolean delete(int id) {
		goodsRepository.delete(id);
		return true;
	}

}
