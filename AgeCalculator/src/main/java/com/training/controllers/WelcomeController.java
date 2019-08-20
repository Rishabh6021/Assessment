package com.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class WelcomeController {
	
	@RequestMapping("/") // Request with / and here /index 
	public String init() //Handler Mapping returns Controller ,then controller returns view and which is resolved by viewresolver
	{
	  return "index";
	}

}
