package com.spring.framework.basics.spring.bean.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInjectingCollectionDemoApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringInjectingCollectionDemoApplication.class);
	
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("collections.xml")) {
			
			JavaCollectionBean obj = (JavaCollectionBean) applicationContext.getBean("javaCollectionBean");
			logger.info("Java Collections Bean - {}", obj);
			logger.info("List - {}", obj.getAddressList());
			logger.info("Set - {}", obj.getAddressSet());
			logger.info("Map - {}", obj.getAddressMap());
			logger.info("Properties - {}", obj.getAddressProp());
		}
		
	}
}
