package com.forloop;

public class Forloop_Type {

	public static void main(String[] args) {

		// for (intialization condition inc/dec)

		/*
		 * for (int i = 0; i < 10; i++) {
		 * 
		 * 
		 * System.out.println(i);
		 * 
		 * 
		 * }
		 */

		for (int i = 0; i < 5; i++) {// outer loop

			for (int j = 3; j > i; j--) {// inner loop

				System.out.print(i);

			}
			System.out.println();
		}

	}
}
