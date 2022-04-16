package com.iftype;

public class If_Type {

	public static void main(String[] args) {

		int a = 14;

		if (a < 10) {

			System.out.println("condition true");

		} else {
			System.out.println("invalid input");
		}

		System.out.println("***********************************");

		if (a > 12) {

			System.out.println("condition 1 true");

			if (a > 10) {

				System.out.println("condition true");

			} else {
				System.out.println("invalid input");
			}

		} else {
			System.out.println("invalid ");
		}

		System.out.println("***********************************");

		if (a < 12) {

			System.out.println("condition 1 true");

		} else if (a > 13) {

			System.out.println("condition 2 true");

		}

		else {
			System.out.println("invalid output");

		}

	}

}
