package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
			for(int j=1; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}//if
			}//for
			System.out.println(lotto[i]);
		}
		
	}
}
