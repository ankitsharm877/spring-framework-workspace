package com.spring.framework.basics.springindepth.basic;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.framework.basics.springindepth.SpringInDepthComponentScanApplication;

@Component
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	private static Logger logger = LoggerFactory.getLogger(SpringInDepthComponentScanApplication.class);
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
//	@Autowired
//	private SortAlgorithm bubbleSortAlgorithm;
	
//	@Autowired
//	@Qualifier("quick")
//	private SortAlgorithm SortAlgorithm;
	
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}
	
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}

	public int binarySearch(int[] arr, int key) {
		int[] sortedArr = this.sortAlgorithm.sort(arr);
		System.out.println(this.sortAlgorithm);
		return Arrays.binarySearch(sortedArr, key);
	}

	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}
}
