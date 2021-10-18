package com.spring.framework.basics.spring.bean.property;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPropertyDemoApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringPropertyDemoApplication.class);
	
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			OuterBean obj = (OuterBean) applicationContext.getBean("outerBean");
			logger.info("Outer Bean - {}", obj);
			logger.info("Inner Bean - {}", obj.getTarget());
		}
		
	}
}
