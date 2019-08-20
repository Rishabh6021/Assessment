package com.training.cofig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class RegisterDispatcher extends AbstractAnnotationConfigDispatcherServletInitializer {
//This dispatcher servlet relies on Annotation based configuration which is abstract class
	//AbstractAnnotationConfigDispatcherServletInitializer has got Web Application Initializers under its hierarchy 
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {MvcConfig.class};
		
	}
	//All requests will be first handled by DispatcherServlet.
	
	//TomCat provides runtime environment for Web applications

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
