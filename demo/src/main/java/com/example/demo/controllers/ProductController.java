package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductController 
{
	@Autowired
	ProductService pservice;
	
	@PostMapping("/addProduct")
	public String addNewProduct(@RequestBody Product c)
	{
		return pservice.saveProduct(c);	
	}
	
	@PostMapping("/deleteProduct")
	public String deleteProduct(Product p)
	{
		return pservice.deleteProduct(p);
	}
	
	@GetMapping("/allProducts")
	public List<Product> getAlProducts()
	{
		return	pservice.getAllProducts();
	}
	
}
