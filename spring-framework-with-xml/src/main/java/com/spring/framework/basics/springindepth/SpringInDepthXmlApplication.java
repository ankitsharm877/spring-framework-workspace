package com.spring.framework.basics.springindepth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.framework.basics.springindepth.xml.PersonDAO;

public class SpringInDepthXmlApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringInDepthXmlApplication.class);
	
	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {

			logger.info("Beans loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
			
			PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
			
			logger.info("{}",personDAO);
			logger.info("{}", personDAO.getJdbcConnection());
		}
	}
}
