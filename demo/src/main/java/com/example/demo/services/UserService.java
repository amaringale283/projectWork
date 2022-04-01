package com.example.demo.services;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService 
{
	@Autowired
	UserRepository urepo;
	
	public User getUser(int id)
	{
		Optional<User> u = urepo.findById(id);
		User user;
		try
		{
			user = u.get();
		}
		catch(NoSuchElementException e)
		{
			user = null;
		}
		return user;
	}
	
	public String findUser(String username, String password)
	{
		User user = urepo.findUser(username, password);
		if(user != null)
		{
			if(user.getRole().equals("admin"))
				return "admin";
			else if(user.getRole().equals("ga"))
				return "ga";
			else if(user.getRole().equals("retailer"))
				return "retailer";
			else return "customer";
		}
		else
			return "User does not exist";
		
	}
	
	public User saveUser(User u)
	{
		return urepo.save(u);
	}
}
