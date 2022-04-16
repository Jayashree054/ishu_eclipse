package com.constructor;

import java.util.Scanner;

public class Scanner_type {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nextLine = s.nextLine();
		System.out.println(nextLine);
		String nextLine2 = s.next();
		System.out.println(nextLine2);
		String nextLine3 = s.nextLine();
		System.out.println(nextLine3);
		int nextLine4 = s.nextInt();
		System.out.println(nextLine4);
		s.close();
	}
}
