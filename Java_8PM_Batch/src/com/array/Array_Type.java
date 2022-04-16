package com.array;

public class Array_Type {
	public static void main(String[] args) {

		int[] a = new int[5];

		a[0] = 12;
		a[1] = 15;
		a[2] = 14;
		a[3] = 23;
		a[4] = 56;

		for (int i = 0; i < 5; i++) {
			System.out.println("value : " + i + " = " + a[i]);

		}

		int s[][] = { { 10, 20 }, { 30, 40 } };

		for (int i = 0; i < 2; i++) {
			System.out.println("Value of : i " + i);
			for (int j = 0; j < 2; j++) {
				System.out.println("Value of : j " + j);
				System.out.println(s[i][j]);
			}
		}

	}
}
