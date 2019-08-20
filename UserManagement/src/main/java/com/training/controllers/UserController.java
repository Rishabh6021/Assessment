package com.training.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.models.User;

@Controller
public class UserController {
	
	@Autowired
	public User user;
	
	@Autowired
	private ModelAndView mdlView;
	
	@GetMapping("/addUser")
	public ModelAndView initForm()
	{   
		
		mdlView.setViewName("addUser");
	    mdlView.addObject("command",user);
		return mdlView;
	}
	
	@ModelAttribute("depts")
	public String[] departments() {
		return new String[] {"Pune","Chennai","Delhi","Kolkata"};
	}
	@PostMapping("/addUser")
    public String onSubmit(@Valid @ModelAttribute("command") User doctor,BindingResult result)
    { 
		String nextPage="success";
		if(result.hasErrors())
		{
			
	    	nextPage="addUser";
	    }
			return nextPage;
		
		}
	
		
}
