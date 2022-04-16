package com.array;

public class Array_Type {

	public static void main(String[] args) {

		int s[] = new int[5];
		s[0] = 14;
		s[1] = 34;
		s[2] = 54;
		s[3] = 87;
		s[4] = 76;

		for (int i = 0; i < 5; i++) {
			System.out.println("value of "+i+" = "+s[i]);

		}
		System.out.println("*******************");

		int d[][] = { { 10, 20 }, { 30, 40 } };
		
		              //00,01     //10,11

		for (int i = 0; i < 2; i++) {
			System.out.println("Value of i = " + i);
			for (int j = 0; j < 2; j++) {
				System.out.println("Value of j = " + j);

				System.out.println(d[i][j]);
			}
		}

	}
}
