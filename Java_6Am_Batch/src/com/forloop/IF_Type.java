package com.forloop;

public class IF_Type {
	public static void main(String[] args) {

		int a = 10;

		if (a > 5) {
			System.out.println("condition 1");
		} else {
			System.out.println("invalid input");
		}
		System.out.println("**********************************");

		if (a < 7) {

			System.out.println("condition 1");
			if (a > 5) {
				System.out.println("condition 2");
			} else {
				System.out.println("invalid inner input");
			}

		} else {
			System.out.println("invalid outer input");
		}

		System.out.println("**********************************");

		if (a < 5) {
			System.out.println("condition 1");
		} else if (a > 6) {
			System.out.println("condition 2");
		} else if (a > 8) {
			System.out.println("condition 3");
		} else {
			System.out.println("invalid outer input");
		}

	}
}
