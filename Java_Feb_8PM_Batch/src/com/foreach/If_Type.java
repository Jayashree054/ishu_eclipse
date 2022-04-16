package com.foreach;

public class If_Type {
	public static void main(String[] args) {

		int a = 10;

		if (a < 5) {
			System.out.println("condition true");
		} else {
			System.out.println("invalid input");
		}

		System.out.println("***************************************");

		if (a > 5) {
			System.out.println("condition1 true");

			if (a < 5) {
				System.out.println("condition2 true");
			} else {
				System.out.println("invalid inner input");
			}

		} else {
			System.out.println("invalid outer input");
		}
		System.out.println("***************************************");

		if (a < 5) {
			System.out.println("condition 1 true");
		} else if (a > 7) {
			System.out.println("condition 2 true");
		} else if (a < 6) {
			System.out.println("condition 3 true");
		} else if (a > 8) {
			System.out.println("condition 4 true");
		} else {

			System.out.println("invalid input");
		}

	}
}
