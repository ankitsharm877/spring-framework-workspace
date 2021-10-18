package com.spring.framework.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.framework.aop.springaop.data.Dao1;

@Service
public class Business1 {

	@Autowired
	Dao1 dao1;
	
	public String calculateSomething() {
		return dao1.retrieveSomeData();
	}
	
}
