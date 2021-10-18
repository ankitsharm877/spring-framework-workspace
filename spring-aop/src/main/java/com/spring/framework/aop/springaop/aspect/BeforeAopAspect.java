package com.spring.framework.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAopAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//execution(* PACKAGE.*.*(..))
	
	//@Before("execution(* com.spring.framework.aop.springaop.business.*.*(..))")
	@Before("com.spring.framework.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void beforeAccessBusiness(JoinPoint joinPoint) {
		logger.info("Check for user access for business");
		logger.info("Allowed execution for - {}", joinPoint);
	}
	
	//@Before("execution(* com.spring.framework.aop.springaop.data.*.*(..))")
	@Before("com.spring.framework.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void beforeAccessData(JoinPoint joinPoint) {
		logger.info("Check for user access for data");
		logger.info("Allowed execution for - {}", joinPoint);
	}
}
