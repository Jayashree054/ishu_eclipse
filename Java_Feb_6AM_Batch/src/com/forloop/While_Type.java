package com.forloop;

public class While_Type {

	public static void main(String[] args) {

		int a = 10;

		while (a > 5) {
			System.out.println("Before: " + a);
			a--;
			System.out.println("After :" + a);
		}
		System.out.println("**********************");
		int i = 10;

		do {
			System.out.println("Before: " + i);
			i--;
			System.out.println("After :" + i);
		} while (i < 5);

		System.out.println("**********************");

		int s[] = { 22, 45, 87, 98, 80 };

		// for datatype eachitem : arrayref
		for (int j : s) {
			System.out.println(j);
		}

	}
}
