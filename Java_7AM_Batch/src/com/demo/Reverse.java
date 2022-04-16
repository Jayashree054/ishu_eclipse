package com.demo;

public class Reverse {
	public static void main(String[] args) {
		String s = "emoclew", reverse = "";
		char ch;

		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			reverse = ch + reverse;
		}
		System.out.println(reverse);
	}

}
