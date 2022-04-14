package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.AdminStock;
import com.example.demo.services.AdminStockService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AdminStockController {
	@Autowired
	AdminStockService asservice;
	
	@GetMapping("/getAdminStock")
	public List<AdminStock> getStock(@RequestParam int loginid)
	{
		return asservice.getStock(loginid);
	}
}
