package com.xworkz.suicide.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("create getRootConfigClasses ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("create getServletConfigClasses");
		return new Class[] {SpringConfiguration.class};
		}

	@Override
	protected String[] getServletMappings() {
		System.out.println("create getServletMappings");
		return new String []{"*.do"};
	}

}
