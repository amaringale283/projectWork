package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Retailer;
import com.example.demo.repositories.RetailerRepository;

@Service
public class RetailerService 
{
	@Autowired
	RetailerRepository rrepo;
	
	public String saveRetailer(Retailer r)
	{
		try
		{
			rrepo.save(r);
			return "Retailer registered";
		}
		catch(Exception e)
		{
			return "Registration of retailer failed";
		}
	}
}
