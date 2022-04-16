package com.ifType;

public class If_Type {
	public static void main(String[] args) {

		int a = 10;
		if (a < 5) {
			System.out.println(a);
		} else {
			System.out.println("invalid input");
		}

		int i = 10;
		if (i < 5) {
			System.out.println("Condition Statement1");
			if (i > 6) {
				System.out.println("Condition Statement2");
			} else {
				System.out.println("invalid input in inner block");
			}

		} else {
			System.out.println("invalid input in outer block");
		}

		int m = 40;
		// m=mark

		if (i > 5) {
			System.out.println("Condition 1");
		} else if (i < 6) {
			System.out.println("Condition 2");
		} else if (i < 7) {
			System.out.println("Condition 3");
		} else {
			System.out.println("invalid input");
		}

	}
}
