package com.foreach;

public class Foreach_Type {

	public static void main(String[] args) {

		// datatype ref = {value};

		int a[] = { 12, 23, 45, 46, 45 };
		
		System.out.println("122,34,34,46");

		// (datatype eachitem : ref)
		for (int i : a) {
			System.out.println(i);
		}

		int i = 10;

		while (i > 5) {
			System.out.println(i);
			i--;
			System.out.println(i);
		}

		do {
			System.out.println(i);
			i--;
			System.out.println(i);
		} while (i > 5);

		
	}
}
