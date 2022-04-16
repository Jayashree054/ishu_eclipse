package com.forloop;

public class Forloop_Type {

	public static void main(String[] args) {

		// for(starting; condi, iteration)

		/*
		 * for (int i = 0; i <= 5; i++) {
		 * 
		 * System.out.println(i);
		 * 
		 * }
		 */

		for (int i = 0; i < 5; i++) { // outer loop

			for (int j = 0; j < i; j++) { // inner loop

				System.out.print(j);
			}

			System.out.println();
		}

	}
}
