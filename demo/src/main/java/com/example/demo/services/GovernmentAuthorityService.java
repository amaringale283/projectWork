package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.GovernmentAuthority;
import com.example.demo.repositories.GovernmentAuthorityRepository;

@Service
public class GovernmentAuthorityService 
{
	@Autowired
	GovernmentAuthorityRepository garepo;
	
	public String saveGa(GovernmentAuthority ga)
	{
		try
		{
			garepo.save(ga);
			return "registered";
		}
		catch(Exception e)
		{
			return "registrationFailed";
		}
	}
}
