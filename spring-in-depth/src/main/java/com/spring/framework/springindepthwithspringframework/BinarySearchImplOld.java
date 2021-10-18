package com.spring.framework.springindepthwithspringframework;

import java.util.Arrays;

public class BinarySearchImplOld {
	
	private SortAlgorithmOld sortAlgorithm;
	
	public BinarySearchImplOld(SortAlgorithmOld sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	

	public int binarySearch(int[] arr, int key) {
		
		//BubbleSortAlgorithm algorithm = new BubbleSortAlgorithm();
		//int[] sortedArr = algorithm.sort(arr);
		
		int[] sortedArr = this.sortAlgorithm.sort(arr);
		
		return Arrays.binarySearch(sortedArr, key);
	}
}
