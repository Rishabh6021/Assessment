package com.training.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.training.models.Dob;


@Configuration //Core config and web configurations
@EnableWebMvc //tells this configuration is related to webmvc
@ComponentScan(basePackages="com.training.controllers")
public class MvcConfig implements WebMvcConfigurer {
	
	@Bean  //helps resolving index to something
	public InternalResourceViewResolver resolver() 
	{ 
		InternalResourceViewResolver resolver= new InternalResourceViewResolver();
		
		resolver.setPrefix("WEB-INF/views/");
		resolver.setSuffix(".jsp");
		
		resolver.setViewClass(JstlView.class);
		
		
		return resolver;
	}
	@Bean
	public Dob doctor()
	{
		return new Dob();//User will enter values through Gettr-Settte dependency hence here ther is no parameters
	}
	
	
	@Bean
	public ModelAndView mdlView()
	{
		return new ModelAndView();
	}

}
