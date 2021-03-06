package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Order;
import com.example.demo.services.OrderService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class OrderController 
{
	@Autowired
	OrderService oservice;
	
	@GetMapping("/getOrder")
	public Order getOrder(@RequestParam int cid)
	{
		return oservice.getOrderforCustomer(cid);
	}
	
	@PostMapping("/saveOrder")
	public Order addOrder(@RequestBody Order o)
	{ 
		System.out.print(o);
		return oservice.saveOrder(o);
	}
	
	@GetMapping("/getOrderForRetailer")
	public Order getOrderPerRetailer(@RequestParam int rid)
	{
		return oservice.getOrderforRetailer(rid);
	}
	
}
