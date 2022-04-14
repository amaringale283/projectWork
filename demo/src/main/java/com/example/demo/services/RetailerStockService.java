package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.RetailerStock;
import com.example.demo.repositories.RetailerStockRepository;

@Service
public class RetailerStockService {
	@Autowired
	RetailerStockRepository rsrepo;
	
	public List<RetailerStock> getStock(int rid)
	{
		return rsrepo.getStockForRetailer(rid);
	}
}
