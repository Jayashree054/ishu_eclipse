package com.String;

public class String_Type {
	public static void main(String[] args) {

		String s = " WeLCoMe To jAVae ";

		int length = s.length();
		System.out.println("length :" + length);

		boolean equals = s.equals(" WeLCoMe To jAVa ");
		System.out.println("equals :" + equals);

		boolean equalsIgnoreCase = s.equalsIgnoreCase(" WeLCOME To jAVa ");
		System.out.println("equalsIgnoreCase :" + equalsIgnoreCase);

		String upperCase = s.toUpperCase();
		System.out.println("upperCase :" + upperCase);

		String lowerCase = s.toLowerCase();
		System.out.println("lowerCase:" + lowerCase);

		boolean startsWith = s.startsWith(" Wel");
		System.out.println("startsWith :" + startsWith);

		boolean endsWith = s.endsWith("a ");
		System.out.println("endsWith :" + endsWith);

		boolean contains = s.contains("To");
		System.out.println("contains:" + contains);

		int indexOf = s.indexOf("e");
		System.out.println("indexOf :" + indexOf);

		int lastIndexOf = s.lastIndexOf("e");
		System.out.println("lastIndexOf :" + lastIndexOf);

		char charAt = s.charAt(4);
		System.out.println("charAt :" + charAt);

		String replace = s.replace("e", "**");
		System.out.println("replace :" + replace);

		boolean empty = s.isEmpty();
		System.out.println("empty:" + empty);

		String trim = s.trim();
		System.out.println("trim :" + trim);

		String substring = s.substring(4);
		System.out.println("substring :" + substring);

		String substring2 = s.substring(4, 7); //starting (index) end--length
		System.out.println("substring2 :" + substring2);

		String[] split = s.split(" ");

		for (String string : split) {

			System.out.println(string);

		}
	}

}
