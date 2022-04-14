package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController 
{
	@Autowired
	UserService uservice;
	
	@GetMapping("/getUserById/{uid}")
	public User getUserById(@PathVariable("uid") int loginid)
	{
		return uservice.getUser(loginid);
	}
	/*
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/login")
	public String loginAuth(@RequestParam() String username, @RequestParam String password)
	{
		String role = uservice.findUser(username, password); 
		return role;
	}
	*/
	@PostMapping("/login")
	public User login(@RequestBody User user)
	{
		/*String role = uservice.findUser(user.getUsername(), user.getPassword()); 
		return role;*/
		return uservice.findUser(user.getUsername(), user.getPassword()); 
	}
	
	@PostMapping("/addUser")
	public User addNewUser(@RequestBody User user)
	{
		return uservice.saveUser(user);	
	}
	
}
