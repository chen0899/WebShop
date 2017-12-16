package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Orders;
import com.example.demo.repository.OrdersRepository;
import com.example.demo.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService{

	@Autowired
	private OrdersRepository ordersRepository;
	
	
	public Orders save(Orders orders) {
		return ordersRepository.save(orders);
		
	}

	public List<Orders> findAll() {
		return ordersRepository.findAll();
	}

	public Orders findOne(int id) {
		return ordersRepository.findOne(id);
	}

	public boolean delete(int id) {
		ordersRepository.delete(id);
		return true;
		
	}

}
