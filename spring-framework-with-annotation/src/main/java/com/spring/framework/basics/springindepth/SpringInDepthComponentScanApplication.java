package com.spring.framework.basics.springindepth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.framework.basics.componentscan.ComponentPersonDAO;

@Configuration
@ComponentScan("com.spring.framework.basics.componentscan")
public class SpringInDepthComponentScanApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringInDepthComponentScanApplication.class);
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringInDepthBasicApplication.class)) {

			ComponentPersonDAO componentPersonDAO = applicationContext.getBean(ComponentPersonDAO.class);
			
			logger.info("{}",componentPersonDAO);
		}
	}

}
