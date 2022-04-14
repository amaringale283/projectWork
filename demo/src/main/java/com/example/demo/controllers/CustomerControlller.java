package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.services.CustomerService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CustomerControlller
{
	@Autowired
	CustomerService cservice;
	
	@PostMapping("/addCustomer")
	public String addNewCustomer(@RequestBody Customer c)
	{
		return cservice.saveCustomer(c);	
	}
	
	@GetMapping("/getCid")
	public int getCustomerId(@RequestParam int id)
	{
		return cservice.getCustomer(id);
	}
}
