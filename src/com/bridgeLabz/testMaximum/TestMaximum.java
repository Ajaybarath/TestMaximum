package com.bridgeLabz.testMaximum;

public class TestMaximum {
	
	public static void main(String args[]) {

		Integer integerTestCase1[] = {4,2,3};
		Integer integerTestCase2[] = {4,5,3};
		Integer integerTestCase3[] = {4,2,9};
		
		Float floatTestCase1[] = {4f,2f,3f};
		Float floatTestCase2[] = {4f,5f,3f};
		Float floatTestCase3[] = {4f,2f,9f};
		
		String stringTestCase1[] = { "peach", "apple", "banana"};
		String stringTestCase2[] = {"apple", "peach", "banana"};
		String stringTestCase3[] = {"apple", "banana", "peach"};


		
		findMaximum(integerTestCase1);
		findMaximum(integerTestCase2);
		findMaximum(integerTestCase3);
		
		findMaximum(floatTestCase1);
		findMaximum(floatTestCase2);
		findMaximum(floatTestCase3);
		
		findMaximum(stringTestCase1);
		findMaximum(stringTestCase2);
		findMaximum(stringTestCase3);

	}

	private static <T extends Comparable<T>> void findMaximum(T testCase[]) {

		T maximum = testCase[0];
		
		for (int i=0;i<3;i++) {
			if (maximum.compareTo(testCase[i]) < 0) {
				maximum = testCase[i];
			}
		}
		
		System.out.println("The maximum is " + maximum);
		
	}
		
}
