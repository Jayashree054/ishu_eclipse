package com.iftype;

public class If_type {

	public static void main(String[] args) {

		int a = 10;

		if (a < 5) {
			System.out.println("condition true");
		} else {
			System.out.println("invalid input");
		}
		System.out.println("*******************************************");

		if (a > 5) {
			System.out.println("condition1 true");

			if (a > 6) {
				System.out.println("condition2 true");
			} else {
				System.out.println("invalid input in inner");
			}

		} else {
			System.out.println("invalid input in outer");
		}

		System.out.println("********************************************");
		if (a > 5) {
			System.out.println("condition1 true");
		} else if (a < 8) {
			System.out.println("condition2 true");
		} else if (a > 8) {
			System.out.println("condition3 true");
		} else if (a > 5) {
			System.out.println("condition4 true");
		} else {
			System.out.println("invalid input");
		}

	}
}
