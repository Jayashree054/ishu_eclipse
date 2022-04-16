package com.demo;

public class While_1 {
	public static void main(String[] args) {
		int i = 10;
		while (i > 5) {
			System.out.println(i);
			i--;
			System.out.println("i="+i);
		}

		int a=10;
		do {
			System.out.println("a="+a);
			a--;
			System.out.println(a);
			
		} while (a >5);
	}
}
