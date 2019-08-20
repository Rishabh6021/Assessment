package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.User;
import com.example.demo.service.FlightService;
import com.example.demo.service.UserService;

public class HomeController {
	@Autowired
	private UserService userService;

	
	@GetMapping("/saveuser")
	public String saveUser(@RequestParam int id,@RequestParam String name, @RequestParam String street, @RequestParam String city, @RequestParam String state, @RequestParam String contact_number) {
		User user = new User(id,name,street,city,state,contact_number);
		userService.saveMyUser(user);
		return "User Saved";
	}

}
