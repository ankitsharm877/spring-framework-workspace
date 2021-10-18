package com.spring.framework.basics.springindepth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.framework.basics.springindepth.cdi.SomeCDIBusiness;

@SpringBootApplication
public class SpringInDepthCDIApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringInDepthCDIApplication.class);
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringInDepthCDIApplication.class, args);

		SomeCDIBusiness cdiBusiness = applicationContext.getBean(SomeCDIBusiness.class);
		
		logger.info("{} dao-{}",cdiBusiness, cdiBusiness.getSomeCDIDAO());
	}

}
