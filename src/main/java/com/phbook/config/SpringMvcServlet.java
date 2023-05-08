package com.phbook.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class SpringMvcServlet extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	//same application context la path deto same ts kam krt
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {SpringHbmConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {SpringHbmConfig.class};
	}

	@Override
	//kontya page vr jaych tya sati
	protected String[] getServletMappings() {
		
		return new String [] {"/"};
	}
	

}

