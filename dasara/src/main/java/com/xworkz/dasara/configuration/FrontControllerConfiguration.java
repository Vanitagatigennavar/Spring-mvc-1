package com.xworkz.dasara.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
    System.out.println("created getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		System.out.println("create getServletConfigClasses");
		return new Class []{SpringConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
    System.out.println("create getServletMappings");
		return new String[] {"*.do"};
	}

}
