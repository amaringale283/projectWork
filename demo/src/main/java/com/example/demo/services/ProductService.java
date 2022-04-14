package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository prepo;
	
	public String saveProduct(Product p)
	{
		try
		{
			prepo.save(p);
			return "saved";
		}
		catch(Exception e)
		{
			return "failed";
		}
	}
	
	public String deleteProduct(Product p)
	{
		try
		{
			prepo.delete(p);
			return "deleted";
		}
		catch(Exception e)
		{
			return "failed";
		}
	}
	
	public List<Product> getAllProducts()
	{
		return prepo.findAll();
	}
	
}
