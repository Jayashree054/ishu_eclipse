package com.array1;

public class Array_Type {
	public static void main(String[] args) {

		int a[] = new int[5];

		a[0] = 12;
		a[1] = 34;
		a[2] = 14;
		a[3] = 65;
		a[4] = 28;

		for (int i = 0; i < 5; i++) {

			System.out.println("value of : " + i + " = " + a[i]);

		}

		int s[][] = { { 10, 20 }, { 30, 40 } };

		for (int i = 0; i < 2; i++) {
			System.out.println("value of i: " + i);
			for (int j = 0; j < 2; j++) {
				System.out.println("value of j: " + j);
				System.out.println(s[i][j]);
			}
		}

	}
}
