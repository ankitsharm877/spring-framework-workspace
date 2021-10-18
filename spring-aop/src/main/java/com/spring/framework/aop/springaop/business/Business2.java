package com.spring.framework.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.framework.aop.springaop.data.Dao2;

@Service
public class Business2 {

	@Autowired
	Dao2 dao2;
	
	public String calculateSomething() {
		return dao2.retrieveSomeData();
	}
	
}
