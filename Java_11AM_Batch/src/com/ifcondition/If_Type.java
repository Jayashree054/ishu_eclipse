package com.ifcondition;

public class If_Type {
	public static void main(String[] args) {

		int a = 10;

		if (a < 5) {
			System.out.println("condition true");
		} else {
			System.out.println("invalid input");
		}

		System.out.println("***********************************");

		if (a < 6) {

			System.out.println("condition true");

			if (a > 5) {
				System.out.println("condition true in inner");
			} else {
				System.out.println("invalid input in inner");
			}

		} else {

			System.out.println("invalid input in outer");
		}
		System.out.println("*****************************");

		if (a < 5) {
			System.out.println("condition 1 true");

		} else if (a > 6) {
			System.out.println("condition 2 true");

		} else if (a < 7) {
			System.out.println("condition 3 true");

		} else {
			System.out.println("invalid input");

		}

	}
}
