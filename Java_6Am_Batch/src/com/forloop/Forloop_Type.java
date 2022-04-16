package com.forloop;

public class Forloop_Type {
	public static void main(String[] args) {

		// for(inti , conditi, inc/dec)
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		System.out.println("*****************************");

		for (int i = 0; i < 5; i++) { // outer

			for (int j = 0; j < i; j++) { // inner
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("****************************");

		int[] a = { 29, 45, 74, 25, 56 };

		// for(datatype eachitem : arrayref)
		for (int i : a) {
			System.out.println(i);
		}

	}
}
