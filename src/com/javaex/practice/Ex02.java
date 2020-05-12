package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		// 1번
		double[] a = new double[3];
		a[0] = 6.7;
		a[1] = 3.3;
		a[2] = 1.2;
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("==========");
		
		// 2번
		double[] b = new double[] {6.7, 3.3, 1.2};
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("==========");
		
		// 3번
		double[] c = {6.7, 3.3, 1.2};
		
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}	
		

	}

}
