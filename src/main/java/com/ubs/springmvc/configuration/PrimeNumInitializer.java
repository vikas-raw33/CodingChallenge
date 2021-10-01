package com.ubs.springmvc.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 
 * @author Vikas
 * Dispatcher Serverlet initializer class
 * Mapping of root url
 */
public class PrimeNumInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	  @Override
	    protected Class<?>[] getRootConfigClasses() {
	        return new Class[] { PrimeNumConfiguration.class  };
	    }
	  
	    @Override
	    protected Class<?>[] getServletConfigClasses() {
	        return null;
	    }
	  
	    @Override
	    protected String[] getServletMappings() {
	        return new String[] { "/" };
	    }
}
