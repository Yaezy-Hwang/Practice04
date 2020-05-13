package com.javaex.practice_again;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intA = {3,6,9} ;
		
		int[] intB;
		intB=intA; // 주소 복사(주소 공유)
		
		intB[0] = 20;
		intB[2] = 10;
		
		System.out.print("intA"+" = ");
		System.out.println("intB");
		
		for(int i=0; i<intA.length; i++) {
			System.out.print(intA[i]+"\t");
			System.out.println(intB[i]);
		}
		

	}

}
