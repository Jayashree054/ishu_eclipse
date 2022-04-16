package com.collection;

public class Array_Type {

	public static void main(String[] args) {

		int a[] = new int[5];

		a[0] = 12;
		a[1] = 45;
		a[2] = 65;
		a[3] = 32;
		a[4] = 98;

		for (int i = 0; i < 5; i++) {

			System.out.println("value of "+i+" = "+a[i]);

		}
		System.out.println("**********************************88");
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
