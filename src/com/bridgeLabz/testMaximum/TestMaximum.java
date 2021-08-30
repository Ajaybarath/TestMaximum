package com.bridgeLabz.testMaximum;

public class TestMaximum {
	
	public static void main(String args[]) {

		Integer integerTestCase1[] = {4,2,3};
		Integer integerTestCase2[] = {4,5,3};
		Integer integerTestCase3[] = {4,2,9};

		
		findMaximumInteger(integerTestCase1);
		findMaximumInteger(integerTestCase2);
		findMaximumInteger(integerTestCase3);

	}

	private static void findMaximumInteger(Integer testCase[]) {

		Integer maximum = 0;
		
		for (int i=0;i<3;i++) {
			if (maximum.compareTo(testCase[i]) < 0) {
				maximum = testCase[i];
			}
		}
		
		System.out.println("The maximum is " + maximum);
		
	}
	
}
