package com.bridgeLabz.testMaximum;

public class TestMaximum {
	
	public static void main(String args[]) {

		Integer integerTestCase1[] = {4,2,3};
		Integer integerTestCase2[] = {4,5,3};
		Integer integerTestCase3[] = {4,2,9};
		
		float floatTestCase1[] = {4,2,3};
		float floatTestCase2[] = {4,5,3};
		float floatTestCase3[] = {4,2,9};
		
		String stringTestCase1[] = { "peach", "apple", "banana"};
		String stringTestCase2[] = {"apple", "peach", "banana"};
		String stringTestCase3[] = {"apple", "banana", "peach"};


		
		findMaximumInteger(integerTestCase1);
		findMaximumInteger(integerTestCase2);
		findMaximumInteger(integerTestCase3);
		
		findMaximumFloat(floatTestCase1);
		findMaximumFloat(floatTestCase2);
		findMaximumFloat(floatTestCase3);
		
		findMaximumString(stringTestCase1);
		findMaximumString(stringTestCase2);
		findMaximumString(stringTestCase3);

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
	
	private static void findMaximumFloat(float testCase[]) {

		Float maximum = (float) 2;
		
		for (int i=0;i<3;i++) {
			if (maximum.compareTo(testCase[i]) < 0) {
				maximum = testCase[i];
			}
		}
		
		System.out.println("The maximum is " + maximum);
		
	}
	
	private static void findMaximumString(String testCase[]) {

		String maximum = "";
		
		for (int i=0;i<3;i++) {
			if (maximum.compareTo(testCase[i]) < 0) {
				maximum = testCase[i];
			}
		}
		
		System.out.println("The maximum is " + maximum);
		
	}
	
}
