package com.While;

public class While_Type {

	public static void main(String[] args) {

		int a = 15;

		while (a > 10) {

			System.out.println("before : " + a);

			a--; // a-1

			System.out.println("after : " + a);
		}
		System.out.println("*************************");

		int i = 15;

		do {
			System.out.println("before : " + i);

			i--; // a-1

			System.out.println("after : " + i);
		
		} while (i > 10);

	}

}
