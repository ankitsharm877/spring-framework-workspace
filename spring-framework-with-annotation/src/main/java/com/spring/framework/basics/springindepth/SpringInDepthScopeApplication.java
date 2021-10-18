package com.spring.framework.basics.springindepth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.framework.basics.springindepth.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringInDepthScopeApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringInDepthScopeApplication.class);
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringInDepthScopeApplication.class)) {

			PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
			
			PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
			
			logger.info("{}",personDAO);
			logger.info("{}", personDAO.getJdbcConnection());
			
			logger.info("{}",personDAO1);
			logger.info("{}", personDAO1.getJdbcConnection());
		}
	}

}
