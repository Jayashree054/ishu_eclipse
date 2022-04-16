package com.forloop;

public class Forloop {

	public static void main(String[] args) {

		// forloop

		for (int i = 0; i <= 5;i++) {

			System.out.println(i);
			i++;

		}
		
		System.out.println("****************************************");

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <=i; j++) {

				System.out.print("*");

			}
			
			System.out.println();
		}

	}
}
