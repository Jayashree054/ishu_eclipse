package com.forloop;

public class While_Type {

	public static void main(String[] args) {

		int a = 10;

		while (a > 5) {
			System.out.println("before:" + a);
			a--;
			System.out.println("after:" + a);

		}
		System.out.println("***********************************8");
		int i = 10;

		do {
			System.out.println("before:" + i);
			i--;
			System.out.println("after:" + i);

		} while (i < 5);

		System.out.println("***********************************8");

		int s[] = { 23, 45, 67, 78 };

		// for (datatype eachitem : arryref)
		for (int e : s) {
			System.out.println(e);
		}
	}

}
