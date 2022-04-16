package com.scanner;

public class Array_Type {

	public static void main(String[] args) {

		// Datatype arrayRefVar[]=new datatype[size];
		int s[] = new int[5];

		s[0] = 34;
		s[1] = 54;
		s[2] = 28;
		s[3] = 98;
		s[4] = 35;

		for (int i = 0; i < 3; i++) {

			System.out.println(s[i]);

		}
		System.out.println("***********");

		int a[][] = { { 10, 20 }, { 30, 40 } };

		for (int i = 0; i < 2; i++) {
		
			System.out.println("Value of i = " + i);

			for (int j = 0; j < 2; j++) {
				System.out.println("Value of j = " + j);
				
				System.out.println(a[i][j]);

			}

		}

	}

}
