package com.spring.framework.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.spring.framework.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
	
	@Pointcut("execution(* com.spring.framework.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("com.spring.framework.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution() &&"
			+ "com.spring.framework.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void allLayerExecution() {}
	
	@Pointcut("bean(*Dao)")
	public void beanNameEndingWithDao() {}
	
	@Pointcut("bean(*dao*)")
	public void beanNameContainingDao() {}
	
	@Pointcut("within(com.spring.framework.aop.springaop.data..*)")
	public void dataLayerExecutionWithWithin() {}
	
	@Pointcut("@annotation(com.spring.framework.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {}
}


