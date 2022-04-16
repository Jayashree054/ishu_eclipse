package com.ifcondition;

public class If_Type1 {

	public static void main(String[] args) {
		int a = 10;

		if (a > 5) {
			System.out.println("true");
		} else {
			System.out.println("invalid");
		}

		if (a > 6) {

			System.out.println("condition 1");
			if (a < 5) {
				System.out.println("true");
			} else {
				System.out.println("inner value invalid");
			}
		} else {
			System.out.println("outer value invalid");

		}
		System.out.println("***********************************");
		if (a < 5) {
			System.out.println("condition 1");
		} else if (a > 6) {
			System.out.println("condition 2");
		} else if (a > 7) {
			System.out.println("condition 3");
		} else {
			System.out.println("invalid");
		}

	}

}
