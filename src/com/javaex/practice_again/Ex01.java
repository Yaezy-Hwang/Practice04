package com.javaex.practice_again;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
		int result = 0;
		
		for (int i = 0; i<intArray.length; i++) {
			result += intArray[i];
		}
		System.out.println(result);

	}
}
