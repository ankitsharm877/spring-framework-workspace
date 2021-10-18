package com.spring.framework.basics.spring.bean.factory.method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanFactoryMethodDemoApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringBeanFactoryMethodDemoApplication.class);
	
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("factory-method.xml")) {
			
			//Department obj = (Department) applicationContext.getBean("department");
			Department obj = DepartmentFactory.createDepartmentBean("manager");
			logger.info("Bean Autowiring - {}", obj);
			logger.info("Bean Autowiring - {}", obj.getName());
		}
		
	}
}
