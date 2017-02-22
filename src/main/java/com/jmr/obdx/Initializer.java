/*package com.jmr.obdx;
import javax.servlet.Filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.jmr.obdx.filter.CsrfTokenResponseCookieBindingFilter;

@Configuration
public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer  {

	@Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { JmrOBDXApplication.class };
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
    
    @Override
    protected Filter[] getServletFilters() {
    	Filter [] singleton = { new CsrfTokenResponseCookieBindingFilter() };
    	return singleton;
	}

}
*/