package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Goods;

public interface GoodsService {
	
	Goods save(Goods goods);
	List<Goods> findAll();
	Goods findOne(int id);
	boolean delete(int id);

}
