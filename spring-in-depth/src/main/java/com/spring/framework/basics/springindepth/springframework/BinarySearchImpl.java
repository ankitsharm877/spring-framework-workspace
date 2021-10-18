package com.spring.framework.basics.springindepth.springframework;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
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

	
}
