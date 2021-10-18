package com.spring.framework.basics.springindepth.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@ComponentScan("com.spring.framework.basics.springindepth.springframework")
@SpringBootApplication
public class SpringInDepthApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringInDepthApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {10,2,3,5}, 2);
		System.out.println("Spring Framework: " + result);
	}

}
