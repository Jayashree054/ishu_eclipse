package com.forloop;

public class While_Type {
	public static void main(String[] args) {

		int a = 10;

		while (a > 5) {
			System.out.println("before: " + a);
			a--;
			System.out.println("after :" + a);

		}

		System.out.println("**********************");
		
		int i=10;
		
		do {
			System.out.println("before: " + i);
			i--;
			System.out.println("after :" + i);

		} while (i < 5);

		
	}
}
