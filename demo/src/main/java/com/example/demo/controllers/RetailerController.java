package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Retailer;
import com.example.demo.services.RetailerService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RetailerController 
{
	@Autowired
	RetailerService rservice;
	
	@PostMapping("/addRetailer")
	public String addNewRetailer(@RequestBody Retailer r)
	{
		return rservice.saveRetailer(r);	
	}
	
	@GetMapping("/getRid")
	public int getRetailerId(@RequestParam int id)
	{
		return rservice.getRetailer(id);
	}
}
