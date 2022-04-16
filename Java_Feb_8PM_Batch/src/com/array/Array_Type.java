package com.array;

public class Array_Type {
	public static void main(String[] args) {

		int a[] = new int[5];
		a[0] = 12;
		a[1] = 34;
		a[2] = 56;
		a[3] = 45;
		a[4] = 67;

		for (int i = 0; i < 5; i++) {

			System.out.println("value of " + i + ": " + a[i]);
		}

		System.out.println("*********************************");

		int s[][] = { { 10, 20 }, { 30, 40 } };

		for (int i = 0; i < 2; i++) {
			System.out.println("before :" + i);
			for (int j = 0; j < 2; j++) {
				System.out.println("After :" + j);

				System.out.println(s[i][j]);
			}

		}
	}
}
