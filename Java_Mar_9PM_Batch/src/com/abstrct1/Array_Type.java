package com.abstrct1;

public class Array_Type {
	public static void main(String[] args) {

		int a[] = new int[5];

		a[0] = 34;
		a[1] = 56;
		a[2] = 38;
		a[3] = 39;
		a[4] = 465;

		for (int i = 0; i < 5; i++) {
			System.out.println("value of " + i + " = " + a[i]);

		}
		System.out.println("************************************");

		int s[][] = { { 10, 20 }, { 30, 40 } };

		for (int i = 0; i < 2; i++) {
			System.out.println("value of i = " + i);
			for (int j = 0; j < 2; j++) {
				System.out.println("value of j = " + j);

				System.out.println(s[i][j]);
			}
		}

	}
}
