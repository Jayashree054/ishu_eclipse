package com.forloop;

public class Forloop {

	
	public static void main(String[] args) {

		// for (intial condit inc/dec) i++(i value+1)

		/*
		 * for (int i = 5; i < 10; i++) {
		 * 
		 * 
		 * System.out.println(i);
		 * 
		 * }
		 */

		for (int i = 0; i < 5; i++) { // outer loop

			for (int j = 0; j <=i; j++) { // inner loop

				System.out.print("*");
			}
			System.out.println();
			
		}

	}
}
