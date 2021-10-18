package com.spring.framework.basics.spring.scopes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.framework.basics.beans.DemoBean;

public class ScopeDemoApplication {

	private static Logger logger = LoggerFactory.getLogger(ScopeDemoApplication.class);
	
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			DemoBean obj = (DemoBean) applicationContext.getBean("demoBean");
			logger.info("Hello World Bean - {}", obj);
			DemoBean obj1 = (DemoBean) applicationContext.getBean("demoBean");
			logger.info("Hello World Bean - {}", obj1);
		}
		
	}
}
