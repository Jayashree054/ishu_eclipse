package com.string;

public class String_Type {

	public static void main(String[] args) {

		String s = " WelCOme To jAVae ";

		int length = s.length();
		System.out.println("length: " + length);

		boolean equals = s.equals(" WelCOme To jaVa ");
		System.out.println("equals : " + equals);

		boolean equalsIgnoreCase = s.equalsIgnoreCase(" Welcome To javaE ");
		System.out.println("equalsIgnoreCase : " + equalsIgnoreCase);

		// ctrl+2,L
		String upperCase = s.toUpperCase();
		System.out.println("upperCase : " + upperCase);

		String lowerCase = s.toLowerCase();
		System.out.println("lowerCase : " + lowerCase);

		boolean startsWith = s.startsWith(" w");
		System.out.println("startsWith : " + startsWith);

		boolean endsWith = s.endsWith("Va ");
		System.out.println("endsWith : " + endsWith);

		boolean contains = s.contains("To");
		System.out.println("contains :" + contains);

		int indexOf = s.indexOf("e");
		System.out.println("indexOf: " + indexOf);

		int lastIndexOf = s.lastIndexOf("e");
		System.out.println("lastIndexOf : " + lastIndexOf);

		char charAt = s.charAt(7);
		System.out.println("charAt : " + charAt);

		String replace = s.replace("e", "**");
		System.out.println("replace : " + replace);

		boolean empty = s.isEmpty();
		System.out.println("empty :" + empty);

		String trim = s.trim();
		System.out.println("trim:" + trim);

		String substring = s.substring(4);
		System.out.println("substring: " + substring);

		String substring2 = s.substring(4, 16);
		System.out.println("substring: " + substring2);

		String[] split = s.split("");
		for (String k : split) {

			System.out.println(k);

		}

	}

}
