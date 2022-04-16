package com.demo;

public class Type {

	public static void main(String[] args) {

		int a = 10;
		if (a < 5) {
			System.out.println("true");

		} else {
			System.out.println("fail");
		}

		int i = 10;

		if (i > 5) {
			System.out.println("silver");
			if (i > 4) {
				System.out.println("gold");
			} else {
				System.out.println("fail");
			}
		}

		int m = 50;
		if (m < 40) {
			System.out.println("fail");
		} else if (m > 40 && m <= 60) {
			System.out.println("average");
		} else if (m > 60 && m <= 80) {
			System.out.println("good");
		} else {
			System.out.println("invalid");
		}

	}

}
