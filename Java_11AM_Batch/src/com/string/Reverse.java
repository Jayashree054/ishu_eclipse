package com.string;

public class Reverse {

	public static void main(String[] args) {
	
		String s = "Welcome", Reverse = "";
		char chs;

		for (int i = 0; i < s.length(); i++) {

			chs = s.charAt(i);

			Reverse = chs + Reverse;

		}
		System.out.println(Reverse);

	}

}
