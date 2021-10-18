package com.spring.framework.basics.springindepth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.framework.basics.springindepth.cdi.SomeCDIBusiness;

@Configuration
@ComponentScan
public class SpringInDepthCDIApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringInDepthCDIApplication.class);
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringInDepthBasicApplication.class)) {

			SomeCDIBusiness cdiBusiness = applicationContext.getBean(SomeCDIBusiness.class);
			
			logger.info("{} dao-{}",cdiBusiness, cdiBusiness.getSomeCDIDAO());
		}
	}

}
