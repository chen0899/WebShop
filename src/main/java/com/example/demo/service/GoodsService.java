package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import com.example.demo.entity.Goods;
import com.example.demo.request.SearchingForSizeRequest;
import com.example.demo.request.SearchingRequest;

public interface GoodsService {
	
	Goods save(Goods goods) throws IOException;
	List<Goods> findAll();
	Goods findOne(int id);
	boolean delete(int id);
	List<Goods> find(SearchingRequest searchingRequest);

}
