package com.Program;

public class Program {

	public static void main(String[] args) {

		System.out.println(12.3 + 12.4 + "Float");
		System.out.println("Good" + 100 + 100);

		// 2)
		String s = "welcome", reverse = " ";
		char ch;

		for (int i = 0; i < s.length(); i++) {

			ch = s.charAt(i);
			reverse = ch + reverse;

		}

		System.out.println(reverse);
	}

}
