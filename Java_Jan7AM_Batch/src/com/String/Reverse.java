package com.String;

public class Reverse {

	public static void main(String[] args) {

		String s = "Welcome", ref = "";
		char ch;

		for (int i = 0; i < s.length(); i++) {

			ch = s.charAt(i);

			ref = ch + ref;

		}
		System.out.println(ref);
	}
}
