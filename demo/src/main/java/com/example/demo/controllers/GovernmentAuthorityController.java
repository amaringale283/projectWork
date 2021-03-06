package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.GovernmentAuthority;
import com.example.demo.services.GovernmentAuthorityService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class GovernmentAuthorityController
{
	@Autowired
	GovernmentAuthorityService gaservice;
	
	@PostMapping("/addGa")
	public String addNewGa(@RequestBody GovernmentAuthority ga)
	{
		return gaservice.saveGa(ga);	
	}
}
