package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.CustomerStock;
import com.example.demo.repositories.CustomerStockRepository;

@Service
public class CustomerStockService
{
	@Autowired
	CustomerStockRepository csrepo;
	
	public String saveCustomerStock(CustomerStock cs)
	{
		try
		{
			csrepo.save(cs);
			return "saved";
		}
		catch(Exception e)
		{
			return "failed";
		}
	}
	
	public List<CustomerStock> getStock(int cid)
	{
		return csrepo.getStockForCustomer(cid);
	}
	
}
