package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.request.LoginRequest;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User save(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
		
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findOne(int id) {
		return userRepository.findOne(id);
	}

	@Override
	public boolean delete(int id) {
		userRepository.delete(id);
		return true;
		
	}

	@Override
	public boolean login(LoginRequest loginRequest) {
		if(loginRequest!=null){
			User user  = userRepository.findByEmail(loginRequest.getEmail());
			if(user!=null){
				if(user.getPassword().equals(loginRequest.getPassword())){
					return true;
				}else{
					throw new IllegalArgumentException("Login or password is incorrect");
				}
			}else{
				throw new IllegalArgumentException("Login or password is incorrect");
			}
		}else{
			throw new IllegalArgumentException("LoginRequest not be null");
		}
	}



}
