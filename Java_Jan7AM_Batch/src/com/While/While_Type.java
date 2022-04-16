package com.While;

public class While_Type {
	public static void main(String[] args) {

		int a = 10;
		while (a >= 5) {
			System.out.println("Before : " + a);
			a--;
			System.out.println("After : " + a);
		}
	
		System.out.println("*******************************************");
		
		
		int i = 12;

		do {
			System.out.println("Before :" + i);
			i--;
			System.out.println("after :" + i);

		} while (i > 5);

	}
}
