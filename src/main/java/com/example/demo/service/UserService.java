package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.request.LoginRequest;

public interface UserService {

	User save(User user);
	List<User> findAll();
	boolean login(LoginRequest loginRequest);
	User findOne(int id);
	boolean delete(int id);
}
