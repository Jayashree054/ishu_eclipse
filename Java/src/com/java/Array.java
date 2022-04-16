package com.java;

public class Array {
	public static void main(String[] args) {
		int[][] a = { { 15, 25, 35 }, { 45, 55, 65 } };
		int[][] b = { { 12, 22, 32 }, { 55, 25, 85 } };

		for (int i = 0; i < b.length; i++) {
			System.out.println("value : "+i);
			for (int j = 0; j < b.length; j++) {
				System.out.println("value :"+j);
				System.out.println(b[i][j]);
			}
		}

	}
}
