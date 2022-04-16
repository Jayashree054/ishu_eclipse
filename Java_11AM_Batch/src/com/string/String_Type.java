package com.string;

public class String_Type {

	public static void main(String[] args) {

		String s = " Welcome to JAvae ";

		int length = s.length(); // start with(1-infinity)
		System.out.println("Length : " + length);

		boolean equals = s.equals(" Welcome to JAva ");
		System.out.println("equals: " + equals);

		boolean equalsIgnoreCase = s.equalsIgnoreCase(" welcome to java ");
		System.out.println("equalsIgnoreCase : " + equalsIgnoreCase);

		boolean startsWith = s.startsWith(" Welco");
		System.out.println("startsWith: " + startsWith);

		boolean endsWith = s.endsWith("va ");
		System.out.println("endsWith : " + endsWith);

		int indexOf = s.indexOf("e");
		System.out.println("IndexOf : " + indexOf);

		int lastIndexOf = s.lastIndexOf("e");
		System.out.println("LastIndexOf : " + lastIndexOf);

		String upperCase = s.toUpperCase();
		System.out.println("upperCase : " + upperCase);

		String lowerCase = s.toLowerCase();
		System.out.println("lowerCase : " + lowerCase);

		char charAt = s.charAt(4);
		System.out.println("charAt : " + charAt);

		boolean contains = s.contains("tO");
		System.out.println("contains : " + contains);

		String replace = s.replace("a", "**");
		System.out.println("replace : " + replace);

		boolean empty = s.isEmpty();
		System.out.println("empty : " + empty);

		String trim = s.trim();
		System.out.println("trim :" + trim);

		String substring = s.substring(4);
		System.out.println("substring : " + substring);

		String substring2 = s.substring(4, 8);
		System.out.println("substring2 : " + substring2);

		String[] split = s.split("");

		for (String string : split) {

			System.out.println(string);

		}

	}
}
