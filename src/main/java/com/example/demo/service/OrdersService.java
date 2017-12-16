package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Orders;

public interface OrdersService {
	
	Orders save(Orders orders);
	List<Orders> findAll();
	Orders findOne(int id);
	boolean delete(int id);

}
