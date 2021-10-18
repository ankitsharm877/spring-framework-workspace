package com.spring.framework.basics.spring.containers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.framework.basics.beans.DemoBean;

public class ApplicationContextDemoApplication {

	private static Logger logger = LoggerFactory.getLogger(ApplicationContextDemoApplication.class);
	
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			DemoBean obj = (DemoBean) applicationContext.getBean("demoBean");
			logger.info("Hello World Bean - {}", obj);
			logger.info("Dependency Bean - {}", obj.getDependency());
			logger.info("Dependency Bean - {}", obj.getDependency().getMessage1());
			logger.info("Dependency Bean - {}", obj.getDependency().getMessage2());
			logger.info("Dependency Bean - {}", obj.getDependency().getMessage3());
		}
		
	}
}
