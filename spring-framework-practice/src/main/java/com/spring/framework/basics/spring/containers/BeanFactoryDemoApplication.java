package com.spring.framework.basics.spring.containers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.spring.framework.basics.beans.DemoBean;

@SuppressWarnings("deprecation")
public class BeanFactoryDemoApplication {

	private static Logger logger = LoggerFactory.getLogger(BeanFactoryDemoApplication.class);
	
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		DemoBean obj = (DemoBean) factory.getBean("demoBean");
		logger.info("Hello World: {}", obj);
		
	}
}
