package com.spring.framework.basics.springindepth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.framework.basics.componentscan.ComponentPersonDAO;

@SpringBootApplication
@ComponentScan("com.spring.framework.basics.componentscan")
public class SpringInDepthComponentScanApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringInDepthComponentScanApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringInDepthComponentScanApplication.class, args);

		ComponentPersonDAO componentPersonDAO = applicationContext.getBean(ComponentPersonDAO.class);
		
		logger.info("{}",componentPersonDAO);

	}

}
