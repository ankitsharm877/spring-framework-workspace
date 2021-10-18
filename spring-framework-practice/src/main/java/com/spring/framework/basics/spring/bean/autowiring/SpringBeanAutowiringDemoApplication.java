package com.spring.framework.basics.spring.bean.autowiring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanAutowiringDemoApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringBeanAutowiringDemoApplication.class);
	
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("beanautowiring.xml")) {
			
			Employee obj = (Employee) applicationContext.getBean("employee");
			logger.info("Bean Autowiring - {}", obj);
			logger.info("Bean Autowiring - {}", obj.getFullName());
		}
		
	}
}
