package com.training.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.models.Dob;

@Controller
public class DobController {
	
	@Autowired
	public Dob dob;
	
	@Autowired
	private ModelAndView mdlView;
	
	@GetMapping("/addDob")
	public ModelAndView initForm()
	{   
		
		mdlView.setViewName("addDob");
	    mdlView.addObject("command",dob);
		return mdlView;
	}
	
	
	
	@PostMapping("/addDob")
    public String onSubmit(@Valid @ModelAttribute("command") Dob dob,BindingResult result,Model model)
    { 
	    
		long yr=dob.getYear();
		long age =2019-yr;
		String nextPage="success";
		model.addAttribute("age",age);
		if(result.hasErrors())
		{
			
	    	nextPage="addDob";
	    }
			return nextPage;
		
		}
	
		
	

}
