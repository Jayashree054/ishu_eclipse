package com.string_method;

public class String_Types {

	public static void main(String[] args) {

		String s = "Welcome to java ";

		int length2 = s.length();
		System.out.println("length2 : " + length2);

		boolean equals = s.equals("Welcome TO Java");
		System.out.println("equals : " + equals);

		boolean equalsIgnoreCase = s.equalsIgnoreCase("WelCome To JAVA ");
		System.out.println("equalsIgnoreCase :" + equalsIgnoreCase);

		boolean startsWith = s.startsWith("wel");
		System.out.println("startsWith :" + startsWith);

		boolean endsWith = s.endsWith("Java");
		System.out.println("endsWith :" + endsWith);

		int indexOf = s.indexOf("a");
		System.out.println("indexof : " + indexOf);

		int lastIndexOf = s.lastIndexOf("a");
		System.out.println("lastIndexOf : " + lastIndexOf);

		String upperCase = s.toUpperCase();
		System.out.println("upperCase : " + upperCase);

		String lowerCase = s.toLowerCase();
		System.out.println("lowerCase : " + lowerCase);

		char charAt = s.charAt(3);
		System.out.println("charAt : " + charAt);

		boolean contains = s.contains("Wel");
		System.out.println("contains :" + contains);

		String replace = s.replace("a", "**");
		System.out.println("replace :" + replace);

		boolean empty = s.isEmpty();
		System.out.println("empty : " + empty);

		String trim = s.trim();
		System.out.println("trim :" + trim);

		String substring = s.substring(3);
		System.out.println("substring :" + substring);

		String substring2 = s.substring(3, 12);
		System.out.println("substring2 :" + substring2);

		String[] split = s.split("");

		for (String st : split) {

			System.out.println(st);
		}

		/*
		 * int length = s.length(); System.out.println("length : " + length);
		 * 
		 * boolean equals = s.equals("Welcome TO Java "); System.out.println("equals : "
		 * + equals);
		 * 
		 * boolean equalsIgnoreCase = s.equalsIgnoreCase(" Welcome TO Java ");
		 * System.out.println("equalsIgnoreCase : " + equalsIgnoreCase);
		 * 
		 * String upperCase = s.toUpperCase(); System.out.println("upperCase : " +
		 * upperCase);
		 * 
		 * String lowerCase = s.toLowerCase(); System.out.println("lowerCase : " +
		 * lowerCase);
		 * 
		 * boolean startsWith = s.startsWith(" We"); System.out.println("startsWith : "
		 * + startsWith);
		 * 
		 * boolean endsWith = s.endsWith("va "); System.out.println("endsWith : " +
		 * endsWith);
		 * 
		 * boolean contains = s.contains("Ja"); System.out.println("contains : " +
		 * contains);
		 * 
		 * int indexOf = s.indexOf("e"); System.out.println("indexOf : " + indexOf);
		 * 
		 * int lastindexOf = s.lastIndexOf("e"); System.out.println("lastindexOf : " +
		 * lastindexOf);
		 * 
		 * char charAt = s.charAt(8); System.out.println("charAt : " + charAt);
		 * 
		 * String replace = s.replace("TO", "**"); System.out.println("replace : " +
		 * replace);
		 * 
		 * String substring1 = s.substring(4); System.out.println("substring: " +
		 * substring1);
		 * 
		 * String substring2 = s.substring(3, 13); System.out.println("substring2 : " +
		 * substring2);
		 * 
		 * boolean empty = s.isEmpty(); System.out.println("empty : " + empty);
		 * 
		 * String trim = s.trim(); System.out.println("trim : " + trim);
		 * 
		 * String[] split = s.split(" "); for (String i : split) {
		 * 
		 * System.out.println(i); }
		 */

	}

}
