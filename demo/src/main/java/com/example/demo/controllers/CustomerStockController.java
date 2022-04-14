package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.CustomerStock;
import com.example.demo.services.CustomerStockService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CustomerStockController {
	@Autowired
	CustomerStockService csservice;
	
	@PostMapping("/addCustomerStock")
	public String addNewCustomerStock(@RequestBody CustomerStock c)
	{
		return csservice.saveCustomerStock(c);	
	}
	
	@GetMapping("/getCustomerStock")
	public List<CustomerStock> getStock(@RequestParam int cid)
	{
		return csservice.getStock(cid);
	}
}
