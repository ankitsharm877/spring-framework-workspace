package com.spring.framework.basics.spring.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DependentBean1 implements InitializingBean, DisposableBean{

	private static Logger logger = LoggerFactory.getLogger(DependentBean1.class);
	
	@Override
	public void afterPropertiesSet() throws Exception {
		logger.info("Dependent Bean afterPropertiesSet()");		
	}

	@Override
	public void destroy() throws Exception {
		logger.info("Dependent Bean destroy()");
	}
	
	public void initMethod() {
		logger.info("Dependent Bean initMethod()");	
	}
	
	public void destroyMethod() {
		logger.info("Dependent Bean destroyMethod()");	
	}
	
	public void defaultInitMethod() {
		logger.info("Dependent Bean defaultInitMethod()");	
	}
	
	public void defaultDestoryMethod() {
		logger.info("Dependent Bean defaultDestoryMethod()");	
	}

}
