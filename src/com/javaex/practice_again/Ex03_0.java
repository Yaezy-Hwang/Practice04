package com.javaex.practice_again;

public class Ex03_0 {

	public static void main(String[] args) {
		
		int[] intA = new int[]{3,6,9} ;
		
		int[] intB = new int[3];
		
		for(int i=0; i<intA.length; i++) {
			intB[i] = intA[i]; // 값복사
		}
		
		intB[0] = 20;
		intB[2] = 10;
		
		System.out.print("intA"+" != ");
		System.out.println("intB");
		
		for(int i=0; i<intA.length; i++) {
			System.out.print(intA[i]+"\t");
			System.out.println(intB[i]);
		}
		

	}

}
