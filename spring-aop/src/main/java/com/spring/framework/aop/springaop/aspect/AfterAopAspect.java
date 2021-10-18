package com.spring.framework.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@After("execution(* com.spring.framework.aop.springaop.business.*.*(..))")
	public void after(JoinPoint joinPoint) {
		logger.info("After execution of - {}", joinPoint);
	}
	
	@AfterReturning(value = "execution(* com.spring.framework.aop.springaop.data.*.*(..))",
			returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("{} returned with {}", joinPoint, result);
	}
	
	@AfterThrowing(value = "execution(* com.spring.framework.aop.springaop.data.*.*(..))",
			throwing  = "exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
		logger.info("{} throwing exception {}", joinPoint, exception);
	}
}
