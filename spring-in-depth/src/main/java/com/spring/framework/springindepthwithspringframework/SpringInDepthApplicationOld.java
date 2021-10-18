package com.spring.framework.springindepthwithspringframework;

public class SpringInDepthApplicationOld {

	public static void main(String[] args) {
		BinarySearchImplOld binarySearchImpl = new BinarySearchImplOld(new QuickSortAlgorithmOld());
		int result = binarySearchImpl.binarySearch(new int[] {10,2,3,5}, 2);
		System.out.println(result);
	}

}
