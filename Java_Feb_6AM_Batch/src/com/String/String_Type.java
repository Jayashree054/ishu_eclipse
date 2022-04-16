package com.String;

public class String_Type {

	public static void main(String[] args) {

		String s = " WelCOme To jAVae ";

		int length = s.length();
		System.out.println("length : " + length);

		boolean equals = s.equals(" WelCome To jAVa ");
		System.out.println("equals :" + equals);

		boolean equalsIgnoreCase = s.equalsIgnoreCase(" Welcome To jAVa ");
		System.out.println("equalsIgnoreCase :" + equalsIgnoreCase);

		boolean startsWith = s.startsWith(" We");
		System.out.println("startsWith :" + startsWith);

		boolean endsWith = s.endsWith("a ");
		System.out.println("endsWith :" + endsWith);

		String upperCase = s.toUpperCase();
		System.out.println("upperCase:" + upperCase);

		String lowerCase = s.toLowerCase();
		System.out.println("lowerCase :" + lowerCase);

		int indexOf = s.indexOf("e");
		System.out.println("indexOf :" + indexOf);

		int lastIndexOf = s.lastIndexOf("e");
		System.out.println("lastIndexOf :" + lastIndexOf);

		char charAt = s.charAt(15);
		System.out.println("charAt:" + charAt);

		boolean contains = s.contains("TO");
		System.out.println("contains: " + contains);

		String replace = s.replace("e", "**");
		System.out.println("replace :" + replace);

		boolean empty = s.isEmpty();
		System.out.println("empty :" + empty);

		String trim = s.trim();
		System.out.println("trim :" + trim);

		String substring = s.substring(4);
		System.out.println("substring :" + substring);
		
		String substring2 = s.substring(4, 8);
		System.out.println("substring2 :"+substring2);
		
		String[] split = s.split("");
		
		for (String i : split) {
			
			System.out.println(i);
			
		}

	}

}
