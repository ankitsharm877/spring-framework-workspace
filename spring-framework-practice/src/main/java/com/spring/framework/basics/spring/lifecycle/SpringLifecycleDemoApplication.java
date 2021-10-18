package com.spring.framework.basics.spring.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLifecycleDemoApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringLifecycleDemoApplication.class);
	
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("lifecycle.xml")) {
			
			DemoBean1 obj = (DemoBean1) applicationContext.getBean("demoBean1");
			logger.info("Hello World Bean - {}", obj);
			logger.info("Dependency Bean - {}",obj.getDependency());
		}
		
	}
}
