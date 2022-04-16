package com.collection;

public class Excp {

	public static void main(String[] args) {

		int a = 10;
		try {
			System.out.println(a / 0);
		} finally {
			System.out.println("Finally block");

		}
	}
}
