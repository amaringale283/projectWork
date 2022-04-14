package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.RetailerStock;
import com.example.demo.services.RetailerStockService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RetailerStockController {
	@Autowired
	RetailerStockService rsservice;
	
	@GetMapping("/getRetailerStock")
	public List<RetailerStock> getStock(@RequestParam int rid)
	{
		return rsservice.getStock(rid);
	}
}
