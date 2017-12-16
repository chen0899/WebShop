package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.request.DeleteRequest;
import com.example.demo.request.LoginRequest;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> users(){
		return userService.findAll();
	}
	
	@PutMapping("/save")
	public User register(@RequestBody User user){
		return userService.save(user);
	}
	
	@PostMapping("/login")
	public boolean login(@RequestBody LoginRequest loginRequest){
		return userService.login(loginRequest);
	}
	
	@DeleteMapping("/delete")
	public boolean delete(@RequestBody DeleteRequest request){
		return userService.delete(request.getId());
	}
	
}
