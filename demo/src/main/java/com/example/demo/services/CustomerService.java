package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Customer;
import com.example.demo.repositories.CustomerRepository;

@Service
public class CustomerService
{
	@Autowired
	CustomerRepository crepo;
	
	public String saveCustomer(Customer c)
	{
		try
		{
			crepo.save(c);
			return "registered";
		}
		catch(Exception e)
		{
			return "registrationFailed";
		}
	}
	
	public int getCustomer(int loginid)
	{
		return crepo.getCustomer(loginid);
	}
}
