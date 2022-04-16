package com.array;

public class Program {
	public static void main(String[] args) {

		String s = "Welcome", reverse = "";
		char ch;

		for (int i = 0; i < s.length(); i++) {

			ch = s.charAt(i);

			reverse = ch + reverse;

		}
		System.out.println(reverse);

	}
}
