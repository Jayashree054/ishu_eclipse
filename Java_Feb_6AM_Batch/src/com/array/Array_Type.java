package com.array;

public class Array_Type {
	public static void main(String[] args) {

		int a[] = new int[5];

		a[0] = 67;
		a[1] = 32;
		a[2] = 45;
		a[3] = 57;
		a[4] = 78;

		for (int i = 0; i < 5; i++) {
			System.out.println("value of " + i + " = " + a[i]);

		}
		System.out.println("******************************");
		int s[][] = { { 10, 20 }, { 30, 40 } };

		for (int i = 0; i < 2; i++) {
			System.out.println("value of " + i);
			for (int j = 0; j < 2; j++) {
				System.out.println("value of " + j);

				System.out.println(s[i][j]);
			}
		}
	}
}
