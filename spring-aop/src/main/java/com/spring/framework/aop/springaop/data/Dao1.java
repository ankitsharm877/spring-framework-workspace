package com.spring.framework.aop.springaop.data;

import org.springframework.stereotype.Repository;

import com.spring.framework.aop.springaop.aspect.TrackTime;

@Repository
public class Dao1 {

	@TrackTime
	public String retrieveSomeData() {
		return "Dao1";
	}
}
