package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[5];
		int sum = 0;
		
		for(int i=0; i<x.length; i++) {
			x[i] = sc.nextInt();
			sum += x[i];
		}
		
		System.out.println("평균은 "+sum/x.length+" 입니다.");
		
		sc.close();
	}

}
