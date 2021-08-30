package com.bridgeLabz.testMaximum;

public class TestMaximum <E extends Comparable <E>> {
	
	E testCase[];
	
	public TestMaximum(E testCase[]) {
		this.testCase = testCase;
	}
	
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


		
		new TestMaximum<Integer>(integerTestCase1).findMaximum();
		new TestMaximum<Integer>(integerTestCase2).findMaximum();
		new TestMaximum<Integer>(integerTestCase3).findMaximum();

		new TestMaximum<Float>(floatTestCase1).findMaximum();
		new TestMaximum<Float>(floatTestCase2).findMaximum();
		new TestMaximum<Float>(floatTestCase3).findMaximum();

		new TestMaximum<String>(stringTestCase1).findMaximum();
		new TestMaximum<String>(stringTestCase2).findMaximum();
		new TestMaximum<String>(stringTestCase3).findMaximum();

	}

	void findMaximum() {

		E maximum = testCase[0];
		
		for (int i=0;i<3;i++) {
			if (maximum.compareTo(testCase[i]) < 0) {
				maximum = testCase[i];
			}
		}
		
		System.out.println("The maximum is " + maximum);
		
	}
		
}
