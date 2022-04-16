package com.While;

public class If_Type {
	public static void main(String[] args) {

		int a = 10;

		if (a > 5) {

			System.out.println("Condition 1 True");

			if (a < 5) {
				System.out.println("Condition 2 True");
			} else {
				System.out.println("invalid inner input");
			}

		} else {
			System.out.println("invalid outer input");
		}

		if (a > 5) {
			System.out.println("Condition 1 True");
		} else if (a > 6) {
			System.out.println("Condition 2 True");
		} else if (a > 7) {
			System.out.println("Condition 3 True");
		} else {
			System.out.println("invalid input");
		}

	}
}
