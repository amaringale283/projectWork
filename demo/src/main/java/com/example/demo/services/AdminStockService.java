package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.AdminStock;
import com.example.demo.repositories.AdminStockRepository;

@Service
public class AdminStockService {
	@Autowired
	AdminStockRepository arepo;
	
	public List<AdminStock> getStock(int loginid)
	{
		return arepo.getStockForAdmin(loginid);
	}
}
