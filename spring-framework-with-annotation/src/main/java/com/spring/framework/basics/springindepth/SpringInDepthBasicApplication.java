package com.spring.framework.basics.springindepth;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.framework.basics.springindepth.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringInDepthBasicApplication {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringInDepthBasicApplication.class)) {
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
			System.out.println(binarySearch);
			System.out.println(binarySearch1);
	
			int result = binarySearch.binarySearch(new int[] { 10, 2, 3, 5 }, 2);
			System.out.println("Spring Framework in Depth: " + result);
		}
	}

}
