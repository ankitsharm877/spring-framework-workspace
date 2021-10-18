package com.spring.framework.basics.springindepth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.framework.basics.springindepth.scope.PersonDAO;

@SpringBootApplication
public class SpringInDepthScopeApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringInDepthScopeApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringInDepthScopeApplication.class, args);

		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		
		logger.info("{}",personDAO);
		logger.info("{}", personDAO.getJdbcConnection());
		
		logger.info("{}",personDAO1);
		logger.info("{}", personDAO1.getJdbcConnection());
	}

}
