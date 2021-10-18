package com.spring.framework.basics.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoBean1 implements BeanPostProcessor{

	DependentBean1 dependentBean1 = null;
	
	public DemoBean1(DependentBean1 dependentBean1) {
		this.dependentBean1 = dependentBean1;
	}
	
	public DependentBean1 getDependency() {
		return dependentBean1;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeforeInitialization : " + beanName);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("AfterInitialization : " + beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
