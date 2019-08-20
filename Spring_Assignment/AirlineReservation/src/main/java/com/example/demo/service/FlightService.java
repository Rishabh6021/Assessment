package com.example.demo.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Flight;
import com.example.demo.models.User;
import com.example.demo.repos.FlightRepository;
import com.example.demo.repos.UserRepository;

@Service
@Transactional
public class FlightService {
	
	@Autowired
	private FlightRepository repo;
	
	

	public Iterable<Flight> findAll(String source, String destination) {
		
	
		return repo.findAll(source,destination);
	}
	
	
}
