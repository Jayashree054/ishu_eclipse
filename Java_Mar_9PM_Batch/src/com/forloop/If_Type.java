package com.forloop;

public class If_Type {
	public static void main(String[] args) {

		int a = 10;

		if (a > 5) {
			System.out.println("condition true");
		} else {
			System.out.println("invalid input");
		}
		System.out.println("**********************");
		if (a > 5) {
			if (a < 5) {
				System.out.println("condition1 true");
			} else {
				System.out.println("invalid inner input");
			}

		} else {
			System.out.println("invalid outer input");
		}

		System.out.println("************");

		if (a < 5) {
			System.out.println("condition 1");
		} else if (a > 6) {
			System.out.println("condition 2");
		} else if (a > 7) {
			System.out.println("condition 3");
		} else {
			System.out.println("invalid input");
		}

	}

}
